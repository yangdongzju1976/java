import javax.swing.*;
/*Swing ��һ��ΪJava��Ƶ�GUI���߰���
Swing��JAVA�������һ���֡�
Swing������ͼ���û����棨GUI�������磺�ı��򣬰�ť���ָ�����ͱ�*/
public class HelloWorldSwing{
	private static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		//���������ô���
		JFrame frame=new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���""hello World"��ǩ
		JLabel label=new JLabel("HelloWorld");
		frame.getContentPane().add(label);
		//��ʾ����
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
