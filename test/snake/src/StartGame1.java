import javax.swing.*;//JFrame��JPanel  Swing ��һ��ΪJava��Ƶ�GUI���߰���Swing��JAVA�������һ����.Swing������ͼ���û����棨GUI�������磺�ı��򣬰�ť���ָ�����ͱ���
import java.awt.*;//Graphics;�����û�����ͻ���ͼ��ͼ������з��ࡣ��AWT�����У����簴ť�������֮����û���������Ϊ�����Component�������� AWT ����ĸ���
public class StartGame1{
	public static void main(String[] args){
		//����һ������
		JFrame jf=new JFrame();
		//���������ñ���
		jf.setTitle("̰����С��Ϸ -�Ƽ���19");  
		//����Ļ������
		int width=Toolkit.getDefaultToolkit().getScreenSize().width; //��ȡ��ʾ���Ŀ���
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;//��ȡ��ʾ���ĸ߶�
		jf.setBounds((width-800)/2,(height-800)/2,800,800 );//��ʾ����ʾ�����м�
		//���ر�
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//������Ĵ�С��ɲ��ɱ�
		jf.setResizable(false);
		
		GamePanel gp=new GamePanel();//����������
		jf.add(gp);//��������ӵ����塣
		//Ĭ�������صġ��������֡� 
		jf.setVisible(true); 
	}

}