import javax.swing.*;//JPanel
import java.awt.*;//颜色，图形、画笔 Graphics
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
/*
KeyAdapter类是一个抽象类（适配器）用于接收键盘事件。这个类的所有方法都是空的。这个类是方便的类创建侦听器对象。
//在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。
*/
import java.awt.event.KeyEvent;
import java.util.Random;
public class GamePanel extends JPanel{
	//定义蛇的坐标
	//将蛇的所有X坐标存到一个数组里
	int snakeX[]=new int[500];
	//将蛇的所有Y坐标存到一个数组里
	int snakeY[]=new int[500];
	//定义蛇的长度
	int length;
	//加入一个定时器
	Timer timer;
	//初始化小蛇
	public void init(){
		//初始化蛇头
		snakeX[0]=200;
		snakeY[0]=200;
		//初始化蛇第一节
		snakeX[1]=175;
		snakeY[1]=200;
		//初始化蛇第二节
		snakeX[2]=150;
		snakeY[2]=200;
		//蛇的长度
		length=3;
	} 
	


	public GamePanel(){// 类的构造器 。生成对象的时候自动运行。
		//初始化变量
		init();
		//将整个屏幕的焦点放在面板上。
		this.setFocusable(true);
		//设置定时器(1) 每100毫秒，执行一次actionPerformed里面的内容
		/*timer = new Timer(100,new ActionListener(){
			@Override   //伪代码,表示重写。(当然不写@Override也可以)，编译器可以给你验证@Override下面的方法名
					  //是否是你父类中所有的，如果没有则报错。
						//例如，你如果没写@Override，而你下面的方法名又写错了，这时你的编译器是可以编译通过的，
						//因为编译器以为这个方法是你的子类中自己增加的方法。
				public void actionPerformed(ActionEvent e){}
		});*/
		//snakeX[0]=snakeX[0]+25; 让蛇动起来
		//设置定时器(2) 修改时间（秒数）观察效果。
		timer = new Timer(60,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
					//System.out.println("hello");
					int t=0;
					for (int i=length-1;i>0 ;i-- )
					{
						snakeX[i]=snakeX[i-1];
						snakeY[i]=snakeY[i-1];
					}
					
					
					
				/*	if (snakeX[0]==750&&snakeY[0]<725) //条件成立，说明碰到右壁，向下。
						snakeY[0]+=25;
					else if (snakeY[0]==725)
					{
						snakeX[0]-=25;
					}					//条件不成立，说明还没有到右壁，继续向前
					else if (snakeY[0]<220)
					{
						snakeX[0]+=25;

					}
						
					*/
					
				/*	if (snakeX[0]!=25&&snakeX[0]<750&&snakeY[0]<225)
						snakeX[0]+=25;
					else if (snakeY[0]<725)
					{
						snakeY[0]+=25;
					}
					else if (snakeX[0]>25)
					{
						snakeX[0]-=25;
					}
					
					if (snakeX[0]==25)
					{
						snakeY[0]-=25;
					}	
					*/
					if (snakeX[0]>100&&snakeX[0]<750&&snakeY[0]<225)
						snakeX[0]+=25;
					else if (snakeX[0]==750&&snakeY[0]>75&&snakeY[0]<725)
							snakeY[0]+=25;
						 else if (snakeY[0]==725&&snakeX[0]!=25)
									snakeX[0]-=25;
							  else if (snakeX[0]==25&&snakeY[0]!=75)
										snakeY[0]-=25;
					               else if (snakeY[0]==75&&snakeX[0]!=750)
											snakeX[0]+=25;
				      					else
											snakeY[0]+=25;

						
					
				}
		});
		
		//设置定时器(1) 重新设置蛇的坐标，让蛇动起来。
	/*	timer = new Timer(100,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
				//蛇运动（1）
				//蛇头运行
				//snakeX[0]=snakeX[0]+25;
				//身子走
				//snakeX[1]=snakeX[1]+25;
				//snakeX[2]=snakeX[2]+25;
				
				//蛇运动（2） 蛇是如何走的。先走身子再走头。
				for (int i=length-1;i>0 ;i-- )//i从length-1到1。 i-1:从length-2到0
				{
					snakeX[i]=snakeX[i-1];  //把snakeX[i-1]替换snakeX[i]的X坐标
					snakeY[i]=snakeY[i-1];  //把snakeY[i-1]替换snakeY[i]的Y坐标
				}
				//往右走
				//snakeX[0]+=25;
				//往左走
				//snakeX[0]-=25;
				//往上走
				//snakeY[0]-=25;
				//往下走
				snakeY[0]+=25;
				/*if (snakeY[0]==750)
				{
					snakeY[0]=100;
					
					snakeX[0]+=25;
				}*/

				//snakeY[0]=snakeY[0]+125;
				//System.out.println("hello");
				/*for (int i=length-1;i>0 ;i-- ){
							snakeX[i]=snakeX[i-1];
							snakeY[i]=snakeY[i-1];
						}
					//蛇头再走
					snakeX[0]=snakeX[0]+25;*/
			//	}
	//	});

		//定时器启动
		timer.start();

	}
	


	
	@Override 
		//paintComponent()是swing的一个方法，相当于图形版的main()，是会自执行的。
	    //如果一个class中有构造函数，则执行顺序是先执行构造函数，再执行这个。
		protected void paintComponent(Graphics g){//Graphics g 画笔。repaint()调用此方法.protected 对于子类及本包可见
			/*
			java绘图时，最常使用到的就是paint(Graphics g)｛...内容...｝方法获取画笔，
			然后利用JPanel等容器作为画布,在JFrame内呈现出内容，很多情况下这种方式都还是很实用，
			
			*/
			//设置画笔
			super.paintComponent(g);//调用父类的方法
			
			//给当前面板设置背景色
			this.setBackground(new Color(179,231,240));//RGB三元色的值.画矩形后覆盖
			
			//设置画笔颜色
			g.setColor(Color.red);
			//绘制40条横线（起点横坐标，起点纵坐标，终点横坐标，终点纵坐标）
			for (int i=3;i<=32 ;i++ )
				g.drawLine(25,25*i,775,25*i);
			//绘制40条竖线
			for (int i=1; i<=31;i++ )
				g.drawLine(25*i,75,25*i,750);
			
			//填充
			//g.fillRect(100,100,100,100);

			//画蛇
			g.fillRect(snakeX[0],snakeY[0],25,25);
			g.setColor(Color.green);
			g.fillRect(snakeX[1],snakeY[1],25,25);
			g.fillRect(snakeX[2],snakeY[2],25,25);
			
			/*for (int i=0;i<length ;i++ )
			{
				g.fillRect(snakeX[i],snakeY[i]+100,25,25);
			}*/
			
			//刷新页面。如果不刷新页面，即使修改蛇的坐标，依然显示老坐标。
			repaint();
}
}
	

