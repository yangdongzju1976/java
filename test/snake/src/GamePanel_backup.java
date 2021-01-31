
//import java.awt.Color;

import javax.swing.*;//JPanel
import java.awt.*;//��ɫ��ͼ�Ρ�����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;


/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GamePanel_backup extends JPanel{
	//��ͼ���߼���Ӧ�ķ��������е�ͼ���߼���д�����������
	//��������������Լ����� �ײ� �Զ����á�
	//���߶�Ӧ������X������ŵ������У�
	int[] snakeX = new int[500];
	//���߶�Ӧ������Y������ŵ������У�
	int[] snakeY = new int[500];
	//��ʼ���ߵĳ���
	int length;
	//����С�ߵ����߷���
	String direction;
	//�����ʼ��״̬
	boolean isStart;
	//����һ����ʼ��������������ʼ��С�ߵ�����
	
	//����һ����ʱ��
	Timer timer;
	public void init(){
		//��ʼ����ͷ
		snakeX[0]=150;
		snakeY[0]=250;
		//��ʼ����һ��������
		snakeX[1]=125;
		snakeY[1]=250;
		//��ʼ���ڶ���������
		snakeX[2]=100;
		snakeY[2]=250;
		length=3;
		//��ʼ���ߵ����߷���
		direction = "R";
		//��ʼ����Ϸ��״̬. ��ֹ״̬
		isStart = false;
	}
	//���幹����
	public GamePanel_backup(){
		init();
		//��������Ļ�Ľ����������ϡ�
		this.setFocusable(true);
		//������̵ļ�����
		this.addKeyListener(new KeyAdapter(){//������ ��һ�����ж�����һ���࣬������������Ϊ�ڲ��ࡣ
			@Override
				public void keyPressed(KeyEvent e){//����������������Ƿ��������̰�ѹ
					super.keyPressed(e);
					//��ȡ�㰴���Ĵ��롣
					int keyCode=e.getKeyCode();
					System.out.println(keyCode);
					if (keyCode==32){
						isStart=!isStart;
						repaint();//ˢ����� JPanel��һ������
					}
				}
		});
		//��ʼ����ʱ��
		timer = new Timer(100,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
					
				}
			
		});
		
		//timer.start();
	}


	@Override
		protected void paintComponent(Graphics g){//Graphics g ���ʡ�repaint()���ô˷���
			//���û���
			super.paintComponent(g);
			//����ǰ������ñ���ɫ
			this.setBackground(new Color(153,205,205));//RGB��Ԫɫ��ֵ
			//��һ��ˮӡͼƬ
			Images.headerImg.paintIcon(this,g,10,10);//�������this������ϣ��û���g,�����꣨10��10������ͼƬheader.png
			g.setColor(new Color(153,153,105));
			//����Ϸ���壬Ĭ�Ϻ�ɫ
			g.fillRect(10,70,770,685);
			
			//�ڶ�Ӧ������λ�ã����ߵĶ�Ӧ��ͼƬ�Ž�ȥ
			//����ͷ
			switch (direction)
			{
			case "U":
				Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
				break;
			case "D":
				Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
				break;
			case "L":
				Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
				break;
			case "R":
				Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
				break;
			
			}
			//Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]); 
			//��������
			/*Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
			Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);
			*/
			for (int i=1;i<length ;i++ )
			{
				Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
			}
			//������Ϸ��״̬����
			if (isStart==false){//��Ϸ��ͣ
				//�������һ������
				g.setColor(new Color(220,0,0));//������ɫ
				g.setFont(new Font("����",Font.BOLD,40));//��������
				g.drawString("����ո�ʼ��Ϸ",250,330);//�������֡����꣨250��330��
			}
			else
		    {
				
		    }
		}

}

/*�ڲ��� �ⲿ�� ����
class Outer{
	int a=5;
	static int b=6;
	void show(){
		System.out.println("hello world");
	}
	class Inner{
		void use(){
			System.out.println(a);//5
			System.out.println(b);//6
			show();
		}
	}
}
�ڲ���ĵ����ⲿ��ķ��������ԡ�
*/
