import javax.swing.*;
import java.awt.*;
public class StartGame{
	public static void main(String[] args){
		//创建一个窗体
		JFrame jf=new JFrame();
		//给窗体设置标题
		jf.setTitle("贪吃蛇小游戏 -云计算19");
		//求屏幕宽、高
		int width=Toolkit.getDefaultToolkit().getScreenSize().width; //获取显示器的宽度
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;//获取显示器的高度
		jf.setBounds((width-800)/2,(height-800)/2,800,800 );//显示在显示器的中间
		//点叉关闭
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//将窗体的大小设成不可变
		jf.setResizable(false);
		//默认是隐藏的。让他显现。 
		jf.setVisible(true);
	}

}
