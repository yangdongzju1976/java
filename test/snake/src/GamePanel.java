import javax.swing.*;//JPanel
import java.awt.*;//颜色，图形、画笔
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
public class GamePanel extends JPanel{
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
	//定义食物的坐标.
	int foodX;	//横坐标
	int foodY;	//纵坐标
	//定义积分
	int scores;
	//定义初始化状态
	boolean isStart;
	//定义小蛇的生死
	boolean isDie;
	//加入一个定时器
	Timer timer;
	//定义一个初始化方法，用来初始化小蛇的坐标
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
		//食物初值
		foodX=25;  //25
		foodY=75;  //75
		//积分初值
		scores=0;
		//初始化生死状态
		isDie = false;
	}
	//定义构造器
	public GamePanel(){
		//初始化变量
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
						if (isDie)
						{
							init();//重新初始化，包括把isDie的状态设为flase
						}
						else{
						isStart=!isStart;
						//repaint();//刷新面板 JPanel的一个方法
						}
					}
					if (keyCode==KeyEvent.VK_UP)
					{
						direction="U";
					}
					if (keyCode==KeyEvent.VK_DOWN)
					{
						direction="D";
					}
					if (keyCode==KeyEvent.VK_LEFT)
					{
						direction="L";
					}
					if (keyCode==KeyEvent.VK_RIGHT)
					{
						direction="R";
					}
				}
		});
		//初始化定时期
		timer = new Timer(100,new ActionListener(){
			//每100毫秒，执行一次actionPerformed里面的内容
			@Override  //伪代码,表示重写。(当然不写@Override也可以)，编译器可以给你验证@Override下面的方法名
					  //是否是你父类中所有的，如果没有则报错。
						//例如，你如果没写@Override，而你下面的方法名又写错了，这时你的编译器是可以编译通过的，
						//因为编译器以为这个方法是你的子类中自己增加的方法。
				public void actionPerformed(ActionEvent e){
					if (isStart && isDie==false ){//游戏开始，小蛇行走
						//改变蛇的坐标，从后一节走到前一节。
						//身子先走
						for (int i=length-1;i>0 ;i-- ){
							snakeX[i]=snakeX[i-1];
							snakeY[i]=snakeY[i-1];
						}
						//蛇头先走
						switch (direction){
							case "U"://snakeX[0]=snakeX[0];
									 snakeY[0]=snakeY[0]-25;
									 break;
							case "D"://snakeX[0]=snakeX[0];
									 snakeY[0]=snakeY[0]+25;
									 break;
							case "L":snakeX[0]=snakeX[0]-25;
									 //snakeY[0]=snakeY[0];
									 break;
							case "R":snakeX[0]=snakeX[0]+25;
									 //snakeY[0]=snakeY[0];
									 break;

						
						}
						//加入小蛇的边界,让蛇碰到边界从另一端出来。
						//横坐标X的有效范围在[25,750]之,纵坐标Y的有效范围在[75,725]之间.并且被25整除。25*[1,30],25*[3,29]。
						if (snakeX[0]<25){  
							snakeX[0]=750;
						}
						if (snakeX[0]>750)
						{
							snakeX[0]=25;
						}
						if (snakeY[0]<75)
						{
							snakeY[0]=725;
						}
						if (snakeY[0]>725)
						{
							snakeY[0]=75;
						}
						//使用随机数。随机产生食物。
						Random r=new Random();
						if (foodX == snakeX[0] && foodY == snakeY[0]) //吃食物
						{
							length++;
							scores+=10;
							foodX = r.nextInt(29)*25+25; //r.nextInt()产生的随机数在（0~29）之间foodX的坐标在[25,750]之间并且被25整除。
							foodY = r.nextInt(27)*25+75;
							//foodY = ((int))(Math.random()*29+3)*25;
							//Math.random()  [0.0,1.0)之间的数
							//（int)(Math.random()*29)  -->[0,28]
							//（int)(Math.random()*29)+ -->[1,29]
						}

						//如果蛇吃到自己身子则死亡
						for (int i=1;i<length ;i++ )
						{
							if (snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i])
							{
								isDie=true;
							
							}
						}

						//刷新页面
						repaint();
					}
					
					//System.out.println("hello");
				}
			
		});
		//定时器启动
		timer.start();
	}


	@Override 
		//paintComponent()是swing的一个方法，相当于图形版的main()，是会自执行的。
	    //如果一个class中有构造函数，则执行顺序是先执行构造函数，再执行这个。
		protected void paintComponent(Graphics g){//Graphics g 画笔。repaint()调用此方法
			//设置画笔
			super.paintComponent(g);//调用父类的方法
			//给当前面板设置背景色
			this.setBackground(new Color(153,205,205));//RGB三元色的值
			//画一张水印图片
			Images.headerImg.paintIcon(this,g,10,10);//在这个（this）面板上，用画笔g,在坐标（10，10）画出图片header.png
			g.setColor(new Color(153,153,105));
			//画游戏画板，默认黑色
			g.fillRect(10,70,770,685);
			//设置颜色
			g.setColor(Color.red);
			//绘制40条横线（起点横坐标，起点纵坐标，终点横坐标，终点纵坐标）
			 for (int i=3;i<=34 ;i++ )
				g.drawLine(25,25*i,775,25*i);
			//绘制40条竖线
			for (int i=1; i<=31;i++ )
				g.drawLine(25*i,75,25*i,750);
			
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
			if (isStart==false &&!isDie ){//游戏暂停
				//面板中有一段文字
				g.setColor(new Color(220,0,0));//设置颜色
				g.setFont(new Font("宋体",Font.BOLD,40));//设置字体
				g.drawString("点击空格开始游戏",250,330);//画上文字。坐标（250，330）
			}
			
			//画食物
			Images.foodImg.paintIcon(this,g,foodX,foodY);
			//画积分
				g.setColor(new Color(255,255,255));//设置颜色
				g.setFont(new Font("宋体",Font.BOLD,20));//设置字体
				g.drawString("积分为："+scores,620,40);//画上文字。坐标（250，330）
			
			if (isDie)
			{
				g.setColor(new Color(220,0,0));//设置颜色
				g.setFont(new Font("微软雅黑",Font.BOLD,20));//设置字体
				g.drawString("小蛇死亡，游戏结束.按空格重新开始游戏",150,330);
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
