
//import java.awt.Color;

import javax.swing.*;//JPanel
import java.awt.*;//颜色，图形、画笔
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;


/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GamePanel_backup extends JPanel{
	//画图的逻辑对应的方法。所有的图的逻辑都写在这个方法中
	//这个方法，不用自己调用 底层 自动调用。
	//将蛇对应的所有X轴坐标放到数组中：
	int[] snakeX = new int[500];
	//将蛇对应的所有Y轴坐标放到数组中：
	int[] snakeY = new int[500];
	//初始化蛇的长度
	int length;
	//定义小蛇的行走方向
	String direction;
	//定义初始化状态
	boolean isStart;
	//定义一个初始化方法，用来初始化小蛇的坐标
	
	//加入一个定时期
	Timer timer;
	public void init(){
		//初始化蛇头
		snakeX[0]=150;
		snakeY[0]=250;
		//初始化第一节蛇身子
		snakeX[1]=125;
		snakeY[1]=250;
		//初始化第二节蛇身子
		snakeX[2]=100;
		snakeY[2]=250;
		length=3;
		//初始化蛇的行走方向
		direction = "R";
		//初始化游戏的状态. 静止状态
		isStart = false;
	}
	//定义构造器
	public GamePanel_backup(){
		init();
		//将整个屏幕的焦点放在面板上。
		this.setFocusable(true);
		//加入键盘的监听器
		this.addKeyListener(new KeyAdapter(){//匿名类 在一个类中定义另一个类，这样定义的类称为内部类。
			@Override
				public void keyPressed(KeyEvent e){//这个方法用来监听是否做过键盘按压
					super.keyPressed(e);
					//获取你按键的代码。
					int keyCode=e.getKeyCode();
					System.out.println(keyCode);
					if (keyCode==32){
						isStart=!isStart;
						repaint();//刷新面板 JPanel的一个方法
					}
				}
		});
		//初始化定时期
		timer = new Timer(100,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
					
				}
			
		});
		
		//timer.start();
	}


	@Override
		protected void paintComponent(Graphics g){//Graphics g 画笔。repaint()调用此方法
			//设置画笔
			super.paintComponent(g);
			//给当前面板设置背景色
			this.setBackground(new Color(153,205,205));//RGB三元色的值
			//画一张水印图片
			Images.headerImg.paintIcon(this,g,10,10);//在这个（this）面板上，用画笔g,在坐标（10，10）画出图片header.png
			g.setColor(new Color(153,153,105));
			//画游戏画板，默认黑色
			g.fillRect(10,70,770,685);
			
			//在对应的坐标位置，将蛇的对应的图片放进去
			//画蛇头
			switch (direction)
			{
			case "U":
				Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
				break;
			case "D":
				Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
				break;
			case "L":
				Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
				break;
			case "R":
				Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
				break;
			
			}
			//Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
			//画蛇身子
			/*Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
			Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);
			*/
			for (int i=1;i<length ;i++ )
			{
				Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
			}
			//根据游戏的状态绘制
			if (isStart==false){//游戏暂停
				//面板中有一段文字
				g.setColor(new Color(220,0,0));//设置颜色
				g.setFont(new Font("宋体",Font.BOLD,40));//设置字体
				g.drawString("点击空格开始游戏",250,330);//画上文字。坐标（250，330）
			}
			else
		    {
				
		    }
		}

}

/*内部类 外部类 举例
class Outer{
	int a=5;
	static int b=6;
	void show(){
		System.out.println("hello world");
	}
	class Inner{
		void use(){
			System.out.println(a);//5
			System.out.println(b);//6
			show();
		}
	}
}
内部类的调用外部类的方法，属性。
*/
