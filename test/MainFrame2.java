import javax.swing.*;//JPanel所在的包。面板
import java.awt.*; //JFrame所在的包。窗体
import java.util.LinkedList; 
import java.util.Timer;//定时器。
import java.util.TimerTask;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame2 extends JFrame{
	private Snake snake;//属性（成员变量）蛇
	private JPanel jPanel;//游戏棋盘
	private Timer timer;//定时器。在指定的时间内调用蛇移动的方向。
	private Node food;//食物

	//创建窗体对象，初始化窗体参数
	public MainFrame2(){
		//初始化窗体
		initFrame();
		//初始化游戏棋盘
		initGamePanel();
		//初始化蛇
		initSnake();
		//初始化食物
		initFood();

		//初始化定时器
		initTimer();
		//设置键盘监听，让蛇随着上下左右方向移动
		setKeyListener();
	}
	//创建食物
	private void initFood(){
		food=new Node();
		food.random();
	}

	//设置键盘监听
	private void setKeyListener(){
		addKeyListener(new KeyAdapter(){ //添加按键侦听器
			@Override //Override是一种标记注解类型，可应用于方法，它告诉编译器该方法是超类中一个方法的覆盖。
			//@Override :伪代码,表示重写(当然不写也可以覆盖)，但加上后会额外检测覆盖前后方法的参数类型是否相同。
			//Overload是重载的意思，Override是覆盖的意思，也就是重写。
			//重写Override表示子类中的方法可以与父类中的某个方法的名称和参数完全相同，通过子类创建的实例对象调用这个方法时，将调用子类中的定义方法，这相当于把父类中定义的那个完全相同的方法给覆盖了，这也是面向对象编程的多态性的一种表现。
				public void keyPressed(KeyEvent e){//KeyEvent就是jre对你按下/释放键盘按键的包装
					//键盘中每一个键都一个编号
					//System.out.println(e.getKeyCode());
					/*
					KeyListener 是java 中的一个接口，用于接收键盘事件（击键）的侦听器接口。旨在处理键盘事件的类
					要么实现此接口（及其包含的所有方法），要么扩展抽象KeyAdapter 类（仅重写有用的方法）。
					然后使用组件的addKeyListener 方法将从该类所创建的侦听器对象向该组件注册。
					按下、释放或键入键时生成键盘事件。然后调用侦听器对象中的相关方法并将该KeyEvent 传递给它。
					*/
				switch (e.getKeyCode())
					{
					case KeyEvent.VK_UP://上
						if(snake.getDirection()!=Direction.DOWN)//如果蛇的运动方向朝下，则不能向上走。
						snake.setDirection(Direction.UP);
						break;
					case KeyEvent.VK_DOWN://下
						if(snake.getDirection()!=Direction.UP)//如果蛇的运动方向朝上，则不能向下走。
							snake.setDirection(Direction.DOWN);
						break;
					case KeyEvent.VK_LEFT://左
						if(snake.getDirection()!=Direction.RIGHT)//如果蛇的运动方向朝右，则不能向左走。
						snake.setDirection(Direction.LEFT);
						break;
					case KeyEvent.VK_RIGHT://右
						if(snake.getDirection()!=Direction.LEFT)//如果蛇的运动方向朝左，则不能向右走
						snake.setDirection(Direction.RIGHT);
						break;
					
					}
				}

		});
	}

	//初始化定时器
	private void initTimer(){
		//创建定时器对象
		timer=new Timer();
		//初始化定时任务。
		TimerTask timerTask=new TimerTask(){
			@Override
				public void run(){
				snake.move();
				//判断蛇头是否和食物重合
				Node head=snake.getBody().getFirst();
				if (head.getX()==food.getX()&&head.getY()==food.getY())
				{
					snake.eat(food);
					//food.random();
				}
				
								//重绘棋盘
				jPanel.repaint();
				}
		};
		//每100毫秒，执行一次定时任务
		timer.scheduleAtFixedRate(timerTask,0,100);

	} 

	private void initSnake(){
		snake=new Snake();
	}
	
	private void initGamePanel(){
		jPanel = new JPanel(){
			//paint是用来绘制面板的内容
			@Override//重载方法paint。
				public void paint(Graphics g){
					g.clearRect(0,0,600,600);
					//g.clearRect();
					//设置画笔颜色
					g.setColor(Color.red);
					//g.drawRect(80,100,40,25);
				
					//绘制40条横线（起点横坐标，起点纵坐标，终点横坐标，终点纵坐标）
					for (int i=0;i<=40 ;i++ )
						g.drawLine(0,15*i,600,15*i);
					//绘制40条竖线
					for (int i=0; i<=40;i++ )
						g.drawLine(15*i,0,15*i,600);
					//绘制蛇
					LinkedList<Node> body=snake.getBody();
					
					for (Node node :body)
					{
						g.fillRect(node.getX()*15,node.getY()*15,15,15);//绘制小格格。
					}
					
					//绘制食物
					g.fillRect(food.getX()*15,food.getY()*15,15,15);
				}
		};
		add(jPanel);//添加棋盘到窗体。
	}

	//1.初始化窗体参数
	private void initFrame(){
		//设置窗体标题
		setTitle("苏安院贪吃蛇");
		//设置窗体大小
		setSize(610,640);
		//设置窗体位置
		setLocation(400,400);
		//设置窗体大小不能改变
		setResizable(false);
		//设置窗体关闭按钮的作用，是正常退出
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		//创建窗体，并显示在屏幕上。
		new MainFrame2().setVisible(true);
		/* MainFrame2 a=new MainFrame2();
		a.setVisible(true);
		*/
	}
	

}
