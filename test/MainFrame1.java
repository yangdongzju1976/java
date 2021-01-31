import javax.swing.*;//JFrame  Swing ��һ��ΪJava��Ƶ�GUI���߰���Swing��JAVA�������һ����.Swing������ͼ���û����棨GUI�������磺�ı��򣬰�ť���ָ�����ͱ�
import java.awt.*;//�����û�����ͻ���ͼ��ͼ������з��ࡣ��AWT�����У����簴ť�������֮����û���������Ϊ�����Component�������� AWT ����ĸ���
public class MainFrame1 extends JFrame{ //JFrame��һ������Ŀ���࣬�ñ�һ�������Ŀ��ӡ�Ҳ��һ�������ࡣ������ӿ���Ƕ�뼸��������
	//����������󣬳�ʼ���������
	public MainFrame1(){
		initFrame();
		//��ʼ����Ϸ����
		initGamePanel();
	}
	
	private void initGamePanel(){
		JPanel jPanel = new JPanel(){
			//paint������������������
			@Override//���ط���paint��
				public void paint(Graphics g){
					//���û�����ɫ
					g.setColor(Color.black);
					//����40�����ߣ��������꣬��������꣬�յ�����꣬�յ������꣩
					for (int i=0;i<=40 ;i++ )
						g.drawLine(0,15*i,600,15*i);
					//����40������
					for (int i=0; i<=40;i++ )
						g.drawLine(15*i,0,15*i,600);
				}
		};
		add(jPanel);//������̵����塣
	}

	//1.��ʼ���������
	private void initFrame(){
		//���ô������
		setTitle("�հ�Ժ̰����");
		//���ô����С
		setSize(610,640);
		//���ô���λ��
		setLocation(400,100);
		//���ô����С���ܸı�
		setResizable(false);
		//���ô���رհ�ť�����ã��������˳�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		//�������壬����ʾ����Ļ�ϡ�
		new MainFrame1().setVisible(true);
	}
	

}
