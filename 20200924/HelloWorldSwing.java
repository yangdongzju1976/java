import javax.swing.*;
/*Swing 是一个为Java设计的GUI工具包。
Swing是JAVA基础类的一部分。
Swing包括了图形用户界面（GUI）器件如：文本框，按钮，分隔窗格和表。*/
public class HelloWorldSwing{
	private static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		//创建及设置窗口
		JFrame frame=new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//添加""hello World"标签
		JLabel label=new JLabel("HelloWorld");
		frame.getContentPane().add(label);
		//显示窗口
		frame.setSize(350, 200);
		//frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}

}
