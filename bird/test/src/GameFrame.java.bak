
import java.io.IOException;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
/**
窗体类
@auther Mr Yang
*/
public class GameFrame extends JFrame{
	//构造造用来做初始化操作。
	public GameFrame(){
		//设置窗体尺寸
		setSize(600,740);//设置宽度和高度
		//设置居中显示 
		setLocationRelativeTo(null);
		//设置关闭窗体的同时终止程序
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置标题
		setTitle("飞翔的小鸟");
		//设置Logo图标../img/0.png
		try{
		setIconImage(ImageIO.read(this.getClass().getResource("img/b0.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//程序入口
	public static void main(String [] args){
		//创建一个窗体对象
		GameFrame frame = new GameFrame();
		//创建面板对象
		GamePanel  panel= new GamePanel();
		//把画板添加到窗体中
		frame.add(panel);
		//显示窗体.
		frame.setVisible(true);
		//启动游戏
		panel.start();
	}


}