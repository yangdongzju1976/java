import javax.swing.*;//JPanel
import java.awt.*;//��ɫ��ͼ�Ρ����� Graphics
/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;*/
import java.util.Random;
public class GamePanel extends JPanel{

	@Override 
		//paintComponent()��swing��һ���������൱��ͼ�ΰ��main()���ǻ���ִ�еġ�
	    //���һ��class���й��캯������ִ��˳������ִ�й��캯������ִ�������
		protected void paintComponent(Graphics g){//Graphics g ���ʡ�repaint()���ô˷���.protected �������༰�����ɼ�
			/*
			java��ͼʱ���ʹ�õ��ľ���paint(Graphics g)��...����...��������ȡ���ʣ�
			Ȼ������JPanel��������Ϊ����,��JFrame�ڳ��ֳ����ݣ��ܶ���������ַ�ʽ�����Ǻ�ʵ�ã�
			
			*/
			//���û���
			super.paintComponent(g);//���ø���ķ���
			
			//����ǰ������ñ���ɫ
			this.setBackground(new Color(179,231,240));//RGB��Ԫɫ��ֵ.�����κ󸲸�
			
			//����Ϸ��壬Ĭ�Ϻ�ɫ��Ҳ����ͨ��setColor������ɫ��
			//g.setColor(new Color(255,0,0)); //202,236,238
			
			 //����Ԥ������ɫ���һ�����Σ��õ�һ����ɫ�ľ��ο顣�����ɫ��
			//g.fillRect(0,0,800,800);
			
			//�����ο�ֻ��������û����䡣
			//g.drawRect(10,10,770,760);
			

			//����������ɫ
			g.setColor(Color.red);
			//������

			//g.drawLine(0,50,800,50); //g.drawLine(�������꣬��������꣬�յ�����꣬�յ������꣩
			
			//�����ߵĴ�ϸ
			/*Graphics2D g2 = (Graphics2D)g;  //g��Graphics����
			
			g2.setColor(Color.red);
			g2.setStroke(new BasicStroke(3));
			g2.drawLine(0,80, 800, 80);
			*/
			//��ϸ���ֻ���
			/*
			for (int i=1,j=5,t=10;i<200 ;i*=2 )
			{		
				g2.setStroke(new BasicStroke(i));
				g2.drawLine(0,j, 800,j);
				j=j+t;
				t=t+20;

			}
			*/
			

			//����40�����ߣ��������꣬��������꣬�յ�����꣬�յ������꣩
			for (int i=3;i<=32 ;i++ )
				g.drawLine(25,25*i,775,25*i);
			//����40������
			for (int i=1; i<=31;i++ )
				g.drawLine(25*i,75,25*i,750);
			
			//���
			//g.fillRect(100,100,100,100);
			g.fillRect(100,100,25,25);
}
}
	