
import java.io.IOException;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
/**
������
@auther Mr Yang
*/
public class GameFrame extends JFrame{
	//��������������ʼ��������
	public GameFrame(){
		//���ô���ߴ�
		setSize(600,740);//���ÿ�Ⱥ͸߶�
		//���þ�����ʾ 
		setLocationRelativeTo(null);
		//���ùرմ����ͬʱ��ֹ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ñ���
		setTitle("�����С��");
		//����Logoͼ��../img/0.png
		try{
		setIconImage(ImageIO.read(this.getClass().getResource("img/b0.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//�������
	public static void main(String [] args){
		//����һ���������
		GameFrame frame = new GameFrame();
		//����������
		GamePanel  panel= new GamePanel();
		//�ѻ�����ӵ�������
		frame.add(panel);
		//��ʾ����.
		frame.setVisible(true);
		//������Ϸ
		panel.start();
	}


}