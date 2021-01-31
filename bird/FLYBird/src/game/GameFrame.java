

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;    //����ſ��Լ̳�

/**
 * ��Ϸ������
 * @author Lenovo1
 *
 */





public class GameFrame extends JFrame {        //�̳�JFrame��
	
	//��������������ʼ������
	
	public GameFrame() {       //GameFrame���幹�������Դ���Ĺ���
		//���ô���ߴ�(���ȣ��߶�)
		setSize(600, 740);     //����Ϊ����ͼƬ�Ĵ�С
		//���þ�����ʾ
		setLocationRelativeTo(null);
		//���ùرմ����ͬʱ��ֹ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ñ���
		setTitle("����С��");
		//����Logoͼ��img/0.ping
		try {
			setIconImage(ImageIO.read(this.getClass().getResource("../image/0.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {     //JAVA����������,һ������ֻ��һ�����
		//����һ���������
		GameFrame frame = new GameFrame();   //frame�൱��һ�����ӣ��Ѷ���װ����������
		//����һ���������
		GamePanel panel = new GamePanel ();
		//����������һ�黭��
		frame.add(panel);
		//��ʾ����`
		frame.setVisible(true);//setVisbile��ʾ����

		
		
	}

			
		}
		
	
