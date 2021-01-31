package src;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel; 
public class GamePanel extends JPanel{
	//声明用于存放背景图片的变量
	BufferedImage bg;  
	//声明一个用于存放地面图片的对象（变量）
	Ground ground;
	//声明一个柱子对象
	Column column1;
	//声明第二个柱子对象
	Column column2;
	//声明一个鸟对象
	Bird bird;
	//游戏准备状态
		boolean start;


	//构造器
	public GamePanel(){
		
		//设置背景颜色
		setBackground(Color.pink);
		//设置背景图片
	/*	try{
			bg=ImageIO.read(this.getClass().getResource("img/背景.png"));//把图片存入变量bg
		} catch (IOException e) {
			e.printStackTrace();
		}
	*/
	bg=Tools.getImg("img/背景.png");
		//初始化地面对象
		ground=new Ground();
		//初始化柱子对象
		column1=new Column(1);
		//初始化第二根柱子对象
		column2=new Column(2);
		//初始化鸟对象
		bird=new Bird();
		//初始化游戏状态，（没有开始为准备状态，若为true则为游戏运行状态）
		start = false;
		//初始化鼠标监听器MouseAdapter
		MouseAdapter adapter = new MouseAdapter(){
			//鼠标点击后需要做什么就写到下面的这个方法内部
			@Override
			public void mouseClicked(MouseEvent e){
				super.mouseClicked(e);
				//System.out.println("hello");
				//小鸟上抛
				if (start==true) //运行状态
				{
					//小鸟上抛
					bird.moveUp();
					System.out.println("已经运行");
					
				}
				else{
					start = true; //点击鼠标开始游戏
					//启动游戏
					start();
					System.out.println("开始运行");
				}
				
			}
		};
		this.addMouseListener(adapter);
		
		}
		//游戏开始的方法
		public void start(){
			System.out.println("start");
			while(true){
				//地面移动
				ground.move();
				//柱子1移动
				column1.move(); 
				//柱子2移动
				column2.move();
				//小鸟飞
				bird.fly();
				//小鸟做自由落体运动
				bird.move();

				try
				{
					//每移动一次休息一秒
					Thread.sleep(10);
					//重新刷新一次。
					repaint();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			
			}
		}
		//把图片画到面板上
		@Override
			public void paint(Graphics g){
				super.paint(g);
				//绘制背景
				g.drawImage(bg,0,0,null);
				
				
				//画柱子
				/*	此处用到了drawImage方法的一个重载。
					方法重载：方法名相同，参数列表不同（不同的参数类型或者参数顺序或者参数个数）。
				*	增加了图片的宽、高的参数
				     参数：1.图片 2.左上角的横坐	3.左上角的纵坐标	4.图片的宽度 5.图片的高度
				*/
				//画第一根柱子
				g.drawImage(column1.img,column1.x,column1.y,column1.w,column1.h,null);
				//画第二根柱子
				g.drawImage(column2.img,column2.x,column2.y,column2.w,column2.h,null);
				//绘制地面图片
				g.drawImage(ground.img,ground.x,ground.y,null);
				//绘制鸟的图片
				g.drawImage(bird.img,bird.x,bird.y,bird.w,bird.h,null);
			}
			//游戏运行的线程 内部类
	class myThread implements Runnable{
		//把线程要干的活放到run方法中。
		@Override
		public void run(){
			while(true){
				//地面移动
				ground.move();
				//柱子1移动
				column1.move(); 
				//柱子2移动
				column2.move();
				//小鸟飞
				bird.fly();
				//小鸟做自由落体运动
				bird.move();

				try
				{
					//每移动一次休息一秒
					Thread.sleep(10);
					//重新刷新一次。
					repaint();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			
			}
		}

	}
}

