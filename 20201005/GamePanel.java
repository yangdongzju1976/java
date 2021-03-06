//吃到自己死亡
//记分

import javax.swing.*;//JPanel
import java.awt.*;//颜色，图形、画笔 Graphics
import java.awt.event.*;
/*import java.awt.event.ActionEvent;
ActionEvent包含一个事件，该事件为执行动作事件ACTION_PERFORMED.触发这个事件
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;  KeyAdapter类是一个抽象类（适配器）用于接收键盘事件。这个类的所有方法都是空的。这个类是方便的类创建侦听器对象。
//在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。
import java.awt.event.KeyEvent;

*/
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
	//定义小蛇的行走方向
	String direction;
	//定义食物的坐标  4
	int foodX;
	int foodY;
	
	//设定小蛇的状态。按空格键停止，再按空格键开始
	boolean isStart;
	//小蛇的存亡状态
	boolean isDie;
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
		//蛇的初始化方向，朝右
		direction="R";
		//小蛇的开始状态为true
		isStart=true;
		//小蛇是活着的
		isDie=false;
		
		//初始化食物坐标  4
		foodX=200;
		foodY=200;

	} 
	


	public GamePanel(){// 类的构造器 。生成对象的时候自动运行。
		//初始化变量
		init();
		//将整个屏幕的焦点放在面板上。
		this.setFocusable(true);
		//加入键盘的监听器
		//在GamePanel构造器内改变direction的值。会使蛇头改变方向吗
		//direction="U"; //初值是"R",改变为"U"
		//键盘监听器  ---匿名内部类（1）
		/*this.addKeyListener(new KeyAdapter(){//匿名类 在一个类中定义另一个类，这样定义的类称为内部类。
			@Override
				public void keyPressed(KeyEvent e){ //这个方法用来监听是否做过键盘按压
					
				}
			});*/
			
		//键盘监听器  ---监听按键、获取键值（2）
		this.addKeyListener(new KeyAdapter(){//匿名类 在一个类中定义另一个类，这样定义的类称为内部类。
			@Override
				public void keyPressed(KeyEvent e){ 
				//这个方法用来监听是否做过键盘按压
				super.keyPressed(e);
				//获取你按键的代码。
				int keyCode=e.getKeyCode();
					//输出键盘码值
				System.out.println(keyCode);
				if (keyCode==37) direction="L"; //KeyEvent.VK_LEFT==37
				if (keyCode==38) direction="U"; //KeyEvent.VK_UP
				if (keyCode==39) direction="R"; //KeyEvent.VK_RIGHT
				if (keyCode==40) direction="D"; //KeyEvent.VK_DOWN
				//按空格键改变小蛇的状态。
				if (keyCode==32) {
					if (isDie)
						init(); //重新初始化，包括把isDie的状态设为flase
					else
					{
						isStart=!isStart;
						//repaint();
					}
					
				}
					
					
				}
			});

			
			
				
		


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
		/*timer = new Timer(1100,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
					System.out.println("hello");
				}
		});*/
		
		//设置定时器(3) 重新设置蛇的坐标，让蛇动起来。
		timer = new Timer(100,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
				//小蛇运动  （0） 判断定时器是否起作用
				//System.out.println("hello");
				//判断小蛇的状态  小蛇运动----最后一步
				if (isStart&&!isDie)
				{
					//
				//往右走
				//snakeX[0]+=25;
				//往左走
				//snakeX[0]-=25;
				//往上走
				//snakeY[0]-=25;
				//往下走
				//snakeY[0]+=25;
			
				//snakeY[0]=snakeY[0]+125;
				
					//小蛇运动  （2）
				/*for (int i=length-1;i>0 ;i-- ){
							snakeX[i]=snakeX[i-1];
							snakeY[i]=snakeY[i-1];
						}
					//蛇头再走
					snakeX[0]=snakeX[0]+25;*/
				
				//蛇运动（1）
				//蛇头运行
				//snakeX[0]=snakeX[0]+25;
				//身子走
				//snakeX[1]=snakeX[1]+25;
				//snakeX[2]=snakeX[2]+25;
				
				//蛇运动（2） 身子
				for (int i=length-1;i>0 ;i-- )
				{
					snakeX[i]=snakeX[i-1];
					snakeY[i]=snakeY[i-1];
				}
				
				//判断蛇的运动方向  头
				switch (direction)
				{
				case "U": snakeY[0]-=25;break;//往上走
				case "D": snakeY[0]+=25;break;//往下走
				case "R": snakeX[0]+=25;break;//往右走
				case "L": snakeX[0]-=25;break;//往左走
				}

				//判断是否越界
				//加入小蛇的边界,让蛇碰到边界从另一端出来。
				//横坐标X的有效范围在[25,750]之,纵坐标Y的有效范围在[75,725]之间.并且被25整除。25*[1,30],25*[3,29]。
				
				//往右走越界后从左侧回来
				if (snakeX[0]>750)
					snakeX[0]=25;
				//往左走越界后从右侧回来
				if (snakeX[0]<25)
					snakeX[0]=750;
				//上下越界如何处理？学生自己写。
				//上越界，从下面回来
				if (snakeY[0]<75)
					snakeY[0]=725;
				//下越界，从上面回来
				if (snakeY[0]>725)
					snakeY[0]=75;

				//吃食物。吃完消失。（1）
				/*if (snakeX[0]==foodX&&snakeY[0]==foodY)
				{
					length++;
					foodX=-1;
					foodY=-1;
				}
				*/
				//吃食物。吃完之后随机产生另一个食物
				Random r=new Random();
				if (snakeX[0]==foodX&&snakeY[0]==foodY)
				{
					length++;
					foodX=r.nextInt(30)*25+25;    //foodX的坐标在[25,750]之间25的倍数 r.nextInt(30)产生[0,30)之间的整数
					foodY=r.nextInt(27)*25+75;//foodY的坐标在[75,725]之间25的倍数。r.nextInt(27)产生[0,27)之间的整数
				}
				
				//蛇吃到自己死亡 （5）
				for (int i=1;i<length ;i++ )
				{
					if (snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i])  //吃到自己死亡。
					{
						isDie=true;
					}
				}
				//刷新页面
						repaint();
				//如何设置碰到墙死亡？

				}// if
				}
		});

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

			//画蛇  吃食物后不长大
			g.fillRect(snakeX[0],snakeY[0],25,25);
			g.setColor(Color.green);
			g.fillRect(snakeX[1],snakeY[1],25,25);
			g.fillRect(snakeX[2],snakeY[2],25,25);
			
			//画蛇  吃食物后长大
			//画蛇头
			/*g.fillRect(snakeX[0],snakeY[0],25,25);
			//变色
			g.setColor(Color.green);
			//画蛇身
			for (int i=1;i<length ; i++)
			{
				g.fillRect(snakeX[i],snakeY[i],25,25);

			}
			
			*/

			//画食物 食物被吃完之后消失 （1）
		/*	if (foodX==-1)
			{
				//食物消失
				g.setColor(new Color(179,231,240));
				g.fillRect(foodX,foodY,25,25);
			}
			else{
			g.setColor(Color.BLUE);
				//g.setColor(new Color(255,100,200));
			g.fillRect(foodX,foodY,25,25);
			}
		*/
			//画食物
			g.setColor(Color.BLUE);
				//g.setColor(new Color(255,100,200));
			g.fillRect(foodX,foodY,25,25);

			/*for (int i=0;i<length ;i++ )
			{
				g.fillRect(snakeX[i],snakeY[i]+100,25,25);
			}*/


			//显示游戏停止状态
			if (!isStart ){//游戏暂停
				//面板中有一段文字
				g.setColor(new Color(220,0,0));//设置颜色
				g.setFont(new Font("宋体",Font.BOLD,40));//设置字体
				g.drawString("点击空格开始游戏",250,330);//画上文字。坐标（250，330）
			}
			//显示小蛇死亡的状态
			if (isDie)
			{
				g.setColor(new Color(220,0,0));//设置颜色
				g.setFont(new Font("微软雅黑",Font.BOLD,30));//设置字体
				g.drawString("小蛇死亡，游戏结束.按空格重新开始游戏",150,330);
			}
			//在上面写标题
				g.setColor(new Color(0,0,0));//设置颜色
				g.setFont(new Font("宋体",Font.BOLD,30));//设置字体
				g.drawString("贪吃蛇----苏安院2019级云计算专业开发",115,45);//画上文字。坐标（250，330）

			//得分
				g.setColor(new Color(255,0,0));//设置颜色
				g.setFont(new Font("隶书",Font.BOLD,20));//设置字体
				g.drawString("得分："+100,685,65);//画上文字。坐标（250，330）

			//刷新页面。如果不刷新页面，即使修改蛇的坐标，依然显示老坐标。
			repaint();
}
}
	
