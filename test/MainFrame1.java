import javax.swing.*;//JFrame  Swing 是一个为Java设计的GUI工具包。Swing是JAVA基础类的一部分.Swing包括了图形用户界面（GUI）器件如：文本框，按钮，分隔窗格和表。
import java.awt.*;//创建用户界面和绘制图形图像的所有分类。在AWT术语中，诸如按钮或滚动条之类的用户界面对象称为组件。Component类是所有 AWT 组件的根。
public class MainFrame1 extends JFrame{ //JFrame是一个顶层的框架类，好比一个窗户的框子。也是一个容器类。这个框子可以嵌入几个玻璃窗
	//创建窗体对象，初始化窗体参数
	public MainFrame1(){
		initFrame();
		//初始化游戏棋盘
		initGamePanel();
	}
	
	private void initGamePanel(){
		JPanel jPanel = new JPanel(){
			//paint是用来绘制面板的内容
			@Override//重载方法paint。
				public void paint(Graphics g){
					//设置画笔颜色
					g.setColor(Color.black);
					//绘制40条横线（起点横坐标，起点纵坐标，终点横坐标，终点纵坐标）
					for (int i=0;i<=40 ;i++ )
						g.drawLine(0,15*i,600,15*i);
					//绘制40条竖线
					for (int i=0; i<=40;i++ )
						g.drawLine(15*i,0,15*i,600);
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
		setLocation(400,100);
		//设置窗体大小不能改变
		setResizable(false);
		//设置窗体关闭按钮的作用，是正常退出
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		//创建窗体，并显示在屏幕上。
		new MainFrame1().setVisible(true);
	}
	

}
