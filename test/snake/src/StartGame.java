import javax.swing.*;
import java.awt.*;
public class StartGame{
	public static void main(String[] args){
		//����һ������
		JFrame jf=new JFrame();
		//���������ñ���
		jf.setTitle("̰����С��Ϸ -�Ƽ���19");
		//����Ļ����
		int width=Toolkit.getDefaultToolkit().getScreenSize().width; //��ȡ��ʾ���Ŀ��
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;//��ȡ��ʾ���ĸ߶�
		jf.setBounds((width-800)/2,(height-800)/2,800,800 );//��ʾ����ʾ�����м�
		//���ر�
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//������Ĵ�С��ɲ��ɱ�
		jf.setResizable(false);
		//Ĭ�������صġ��������֡� 
		jf.setVisible(true);
	}

}
