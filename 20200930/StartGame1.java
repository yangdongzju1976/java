import javax.swing.*;//JFrame��JPanel  Swing ��һ��ΪJava��Ƶ�GUI���߰���Swing��JAVA�������һ����.Swing������ͼ���û����棨GUI�������磺�ı��򣬰�ť���ָ�����ͱ�
import java.awt.*;//Graphics;�����û�����ͻ���ͼ��ͼ������з��ࡣ��AWT�����У����簴ť�������֮����û���������Ϊ�����Component�������� AWT ����ĸ���
public class StartGame1{
	public static void main(String[] args){
		//����һ������.jf��һ�����񣬴������
		JFrame jf=new JFrame();

		//���������ñ���
		jf.setTitle("̰����С��Ϸ -�Ƽ���19"); 
		
		//����Ļ����
		int width=Toolkit.getDefaultToolkit().getScreenSize().width; //��ȡ��ʾ���Ŀ��
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;//��ȡ��ʾ���ĸ߶�
		
		//��ʾ����ʾ�����м�
		jf.setBounds((width-800)/2,(height-800)/2,800,800 );
		
		
		//������Ĵ�С��ɲ��ɱ�
		jf.setResizable(false);
		
		//���������� gp��һ������������GamePanel��һ���࣬��ͬĿ¼�µ���һ���ļ��ж���
		GamePanel gp=new GamePanel();
		
		//�������ӵ����塣
		jf.add(gp);
		//Ĭ�������صġ��������֡� 
		jf.setVisible(true); 
	}

}
