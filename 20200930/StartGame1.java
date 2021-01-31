import javax.swing.*;//JFrame、JPanel  Swing 是一个为Java设计的GUI工具包。Swing是JAVA基础类的一部分.Swing包括了图形用户界面（GUI）器件如：文本框，按钮，分隔窗格和表。
import java.awt.*;//Graphics;创建用户界面和绘制图形图像的所有分类。在AWT术语中，诸如按钮或滚动条之类的用户界面对象称为组件。Component类是所有 AWT 组件的根。
public class StartGame1{
	public static void main(String[] args){
		//创建一个窗体.jf是一个对像，窗体对象
		JFrame jf=new JFrame();

		//给窗体设置标题
		jf.setTitle("贪吃蛇小游戏 -云计算19"); 
		
		//求屏幕宽、高
		int width=Toolkit.getDefaultToolkit().getScreenSize().width; //获取显示器的宽度
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;//获取显示器的高度
		
		//显示在显示器的中间
		jf.setBounds((width-800)/2,(height-800)/2,800,800 );
		
		
		//将窗体的大小设成不可变
		jf.setResizable(false);
		
		//生成面板对象 gp是一个对象。面板对象。GamePanel是一个类，在同目录下的另一个文件中定义
		GamePanel gp=new GamePanel();
		
		//把面板添加到窗体。
		jf.add(gp);
		//默认是隐藏的。让他显现。 
		jf.setVisible(true); 
	}

}
