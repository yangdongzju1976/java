package src;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel; 
public class GamePanel extends JPanel{
	//�������ڴ�ű���ͼƬ�ı���
	BufferedImage bg;  
	//����һ�����ڴ�ŵ���ͼƬ�Ķ��󣨱�����
	Ground ground;
	//����һ�����Ӷ���
	Column column1;
	//�����ڶ������Ӷ���
	Column column2;
	//����һ�������
	Bird bird;
	//��Ϸ׼��״̬
		boolean start;


	//������
	public GamePanel(){
		
		//���ñ�����ɫ
		setBackground(Color.pink);
		//���ñ���ͼƬ
	/*	try{
			bg=ImageIO.read(this.getClass().getResource("img/����.png"));//��ͼƬ�������bg
		} catch (IOException e) {
			e.printStackTrace();
		}
	*/
	bg=Tools.getImg("img/����.png");
		//��ʼ���������
		ground=new Ground();
		//��ʼ�����Ӷ���
		column1=new Column(1);
		//��ʼ���ڶ������Ӷ���
		column2=new Column(2);
		//��ʼ�������
		bird=new Bird();
		//��ʼ����Ϸ״̬����û�п�ʼΪ׼��״̬����Ϊtrue��Ϊ��Ϸ����״̬��
		start = false;
		//��ʼ����������MouseAdapter
		MouseAdapter adapter = new MouseAdapter(){
			//���������Ҫ��ʲô��д���������������ڲ�
			@Override
			public void mouseClicked(MouseEvent e){
				super.mouseClicked(e);
				//System.out.println("hello");
				//С������
				if (start==true) //����״̬
				{
					//С������
					bird.moveUp();
					System.out.println("�Ѿ�����");
					
				}
				else{
					start = true; //�����꿪ʼ��Ϸ
					//������Ϸ
					start();
					System.out.println("��ʼ����");
				}
				
			}
		};
		this.addMouseListener(adapter);
		
		}
		//��Ϸ��ʼ�ķ���
		public void start(){
			System.out.println("start");
			while(true){
				//�����ƶ�
				ground.move();
				//����1�ƶ�
				column1.move(); 
				//����2�ƶ�
				column2.move();
				//С���
				bird.fly();
				//С�������������˶�
				bird.move();

				try
				{
					//ÿ�ƶ�һ����Ϣһ��
					Thread.sleep(10);
					//����ˢ��һ�Ρ�
					repaint();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			
			}
		}
		//��ͼƬ���������
		@Override
			public void paint(Graphics g){
				super.paint(g);
				//���Ʊ���
				g.drawImage(bg,0,0,null);
				
				
				//������
				/*	�˴��õ���drawImage������һ�����ء�
					�������أ���������ͬ�������б�ͬ����ͬ�Ĳ������ͻ��߲���˳����߲�����������
				*	������ͼƬ�Ŀ��ߵĲ���
				     ������1.ͼƬ 2.���Ͻǵĺ���	3.���Ͻǵ�������	4.ͼƬ�Ŀ�� 5.ͼƬ�ĸ߶�
				*/
				//����һ������
				g.drawImage(column1.img,column1.x,column1.y,column1.w,column1.h,null);
				//���ڶ�������
				g.drawImage(column2.img,column2.x,column2.y,column2.w,column2.h,null);
				//���Ƶ���ͼƬ
				g.drawImage(ground.img,ground.x,ground.y,null);
				//�������ͼƬ
				g.drawImage(bird.img,bird.x,bird.y,bird.w,bird.h,null);
			}
			//��Ϸ���е��߳� �ڲ���
	class myThread implements Runnable{
		//���߳�Ҫ�ɵĻ�ŵ�run�����С�
		@Override
		public void run(){
			while(true){
				//�����ƶ�
				ground.move();
				//����1�ƶ�
				column1.move(); 
				//����2�ƶ�
				column2.move();
				//С���
				bird.fly();
				//С�������������˶�
				bird.move();

				try
				{
					//ÿ�ƶ�һ����Ϣһ��
					Thread.sleep(10);
					//����ˢ��һ�Ρ�
					repaint();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			
			}
		}

	}
}

