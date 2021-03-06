
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;    //导入才能继承

/**
 * 画板类
 * @author Lenovo1
 *
 */

public class GamePanel extends JPanel {   //画板也继承JPanel类
	//声明一个用于存放背景图片的变量(盒子)
	BufferedImage bg;
	//声明一个用于存放地面的变量
	Ground ground;
	//声明一	个存放柱子的变量
	Column  column1;
	//声明一个用于存放第二根柱子的变量
	Column column2;
	//声明一个鸟对象
	Bird bird;
	//游戏准备状态
	boolean start;
	//游戏结束状态
	boolean gameOver;
	BufferedImage img;
	BufferedImage imf;
	int score;
	
	//构造器
	public GamePanel() {    //构造器与类同名
		//设置背景色
		setBackground(Color.pink);
		//设置背景图片
		try {
			bg = ImageIO.read(this.getClass().getResource("../image/背景.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//初始化地面对象
		ground = new Ground();
		//初始化柱子对象
		column1 = new Column(0);
		//初始化第二根柱子对象
		column2 =new Column(1);
		//初始化一个鸟对象
		bird =new Bird();
		//初始化游戏状态(没有开始，为准备状态，若为true则为运行状态）
		start = false;
		//初始化游戏结束状态
		gameOver = false;
		
		
		//初始化鼠标监听器
		MouseAdapter adapter =new MouseAdapter() {
			//鼠标点击后需要做什么就需要写到这个方法内部
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(start==false) {//运行状态
					start = true;
					start();
				}else if(gameOver) {
					start = false;
					gameOver = false;
					//重置游戏对象
					//初始化地面对象
					ground = new Ground();
					//初始化柱子对象
					column1 = new Column(0);
					//初始化第二根柱子对象
					column2 =new Column(1);
					//初始化一个鸟对象
					bird =new Bird();
					//初始化分数
					score = 0;
					
					//刷新
					repaint();
				}
				else {//小鸟上抛
					bird.moveup();
				}
				
			}	
	
		};
		this.addMouseListener(adapter);
		
	}
	//游戏开始方法
	public void start() {
		
		
		
		
		//启动游戏运行线程
		MyThread mt = new MyThread();
		//创建线程有所执行的任务装入到线程对象中
		Thread  t =new Thread(mt);
		//将线程纳入线程调度
		t.start();      //告诉cpu可以给我这个线程分配时间片段了
//		
		
		
	}
	//用来向画板上绘制内容的方法  g相当于画笔
	@Override
		public void paint(Graphics g) {
			super.paint(g);
			try {
				img = ImageIO.read(this.getClass().getResource("../image/start.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}try {
				imf = ImageIO.read(this.getClass().getResource("../image/gameover.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			//绘制背景图片    (需要绘制的图片，x坐标，y坐标，null铺满)
			g.drawImage(bg,0,0,null);
			
			//绘制柱子图片
			g.drawImage(column1.img,column1.x,column1.y,column1.w,column1.h,null);
			//绘制2柱子图片
			g.drawImage(column2.img,column2.x,column2.y,column2.w,column2.h,null);
			//绘制地面图片
			g.drawImage(ground.img,ground.x ,ground.y,null) ;
			//绘制鸟图片
			g.drawImage(bird.img,100,bird.y,40,40,null);
			//话准备状态的图片
			if(start == false) {
				g.drawImage(img,50,0,null);
			}//绘制游戏结束的图片
			if(gameOver == true) {
				g.drawImage(imf,50,0,null);}
			//创建一个字体对象
			Font f = new Font("宋体", 200,30);
			//把字体赋给画笔
			g.setFont(f);
			g.setColor(Color.LIGHT_GRAY);
			
			//绘制字符串
			g.drawString("分数:"+ score,30, 50);
			
			}
			
		
	//用接口实现（游戏运行的线程）
				class MyThread implements Runnable{
	//把该线程需要干的活放到run中
				@Override
				public void run() {
					while( true) {
						//让地面移动起来
						ground.move();	
						//柱子移动
						column1.move();
						//柱子2移动
						column2.move();
						//小鸟飞
						bird.fly();
						//小鸟做飞行运动
						
						bird.move();
						//检测小鸟是否与顶部或底部发生碰撞
						boolean boo1 = bird.hit();//若发生碰撞则游戏结束
						//检测小鸟是否与柱子1发生了碰撞
						boolean boo2=bird.hit(column1);
						//检测小鸟是否与柱子2发生了碰撞
						boolean boo3=bird.hit(column2);
						if(boo1 == true||boo2 == true||boo3 == true){
							//更改游戏状态为结束
							gameOver = true;
							//窗体内的对象全部静止
							return;//break结束当前循环，return结束当前发方法
							
						}
						//计算分数
						if(bird.x == column1.x+column1.w|| bird.x == column2.x+column2.w) {
							score  ++;
							
						}
						try {
							Thread.sleep(30); //每移动一次休息一秒钟
							
							repaint();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
	     
			}
}
