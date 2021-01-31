
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;    //������ܼ̳�

/**
 * ������
 * @author Lenovo1
 *
 */

public class GamePanel extends JPanel {   //����Ҳ�̳�JPanel��
	//����һ�����ڴ�ű���ͼƬ�ı���(����)
	BufferedImage bg;
	//����һ�����ڴ�ŵ���ı���
	Ground ground;
	//����һ	��������ӵı���
	Column  column1;
	//����һ�����ڴ�ŵڶ������ӵı���
	Column column2;
	//����һ�������
	Bird bird;
	//��Ϸ׼��״̬
	boolean start;
	//��Ϸ����״̬
	boolean gameOver;
	BufferedImage img;
	BufferedImage imf;
	int score;
	
	//������
	public GamePanel() {    //����������ͬ��
		//���ñ���ɫ
		setBackground(Color.pink);
		//���ñ���ͼƬ
		try {
			bg = ImageIO.read(this.getClass().getResource("../image/����.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//��ʼ���������
		ground = new Ground();
		//��ʼ�����Ӷ���
		column1 = new Column(0);
		//��ʼ���ڶ������Ӷ���
		column2 =new Column(1);
		//��ʼ��һ�������
		bird =new Bird();
		//��ʼ����Ϸ״̬(û�п�ʼ��Ϊ׼��״̬����Ϊtrue��Ϊ����״̬��
		start = false;
		//��ʼ����Ϸ����״̬
		gameOver = false;
		
		
		//��ʼ����������
		MouseAdapter adapter =new MouseAdapter() {
			//���������Ҫ��ʲô����Ҫд����������ڲ�
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if(start==false) {//����״̬
					start = true;
					start();
				}else if(gameOver) {
					start = false;
					gameOver = false;
					//������Ϸ����
					//��ʼ���������
					ground = new Ground();
					//��ʼ�����Ӷ���
					column1 = new Column(0);
					//��ʼ���ڶ������Ӷ���
					column2 =new Column(1);
					//��ʼ��һ�������
					bird =new Bird();
					//��ʼ������
					score = 0;
					
					//ˢ��
					repaint();
				}
				else {//С������
					bird.moveup();
				}
				
			}	
	
		};
		this.addMouseListener(adapter);
		
	}
	//��Ϸ��ʼ����
	public void start() {
		
		
		
		
		//������Ϸ�����߳�
		MyThread mt = new MyThread();
		//�����߳�����ִ�е�����װ�뵽�̶߳�����
		Thread  t =new Thread(mt);
		//���߳������̵߳���
		t.start();      //����cpu���Ը�������̷߳���ʱ��Ƭ����
//		
		
		
	}
	//�����򻭰��ϻ������ݵķ���  g�൱�ڻ���
	@Override
		public void paint(Graphics g) {
			super.paint(g);
			try {
				img = ImageIO.read(this.getClass().getResource("../image/start.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}try {
				imf = ImageIO.read(this.getClass().getResource("../image/gameover.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			//���Ʊ���ͼƬ    (��Ҫ���Ƶ�ͼƬ��x���꣬y���꣬null����)
			g.drawImage(bg,0,0,null);
			
			//��������ͼƬ
			g.drawImage(column1.img,column1.x,column1.y,column1.w,column1.h,null);
			//����2����ͼƬ
			g.drawImage(column2.img,column2.x,column2.y,column2.w,column2.h,null);
			//���Ƶ���ͼƬ
			g.drawImage(ground.img,ground.x ,ground.y,null) ;
			//������ͼƬ
			g.drawImage(bird.img,100,bird.y,40,40,null);
			//��׼��״̬��ͼƬ
			if(start == false) {
				g.drawImage(img,50,0,null);
			}//������Ϸ������ͼƬ
			if(gameOver == true) {
				g.drawImage(imf,50,0,null);}
			//����һ���������
			Font f = new Font("����", 200,30);
			//�����帳������
			g.setFont(f);
			g.setColor(Color.LIGHT_GRAY);
			
			//�����ַ���
			g.drawString("����:"+ score,30, 50);
			
			}
			
		
	//�ýӿ�ʵ�֣���Ϸ���е��̣߳�
				class MyThread implements Runnable{
	//�Ѹ��߳���Ҫ�ɵĻ�ŵ�run��
				@Override
				public void run() {
					while( true) {
						//�õ����ƶ�����
						ground.move();	
						//�����ƶ�
						column1.move();
						//����2�ƶ�
						column2.move();
						//С���
						bird.fly();
						//С���������˶�
						
						bird.move();
						//���С���Ƿ��붥����ײ�������ײ
						boolean boo1 = bird.hit();//��������ײ����Ϸ����
						//���С���Ƿ�������1��������ײ
						boolean boo2=bird.hit(column1);
						//���С���Ƿ�������2��������ײ
						boolean boo3=bird.hit(column2);
						if(boo1 == true||boo2 == true||boo3 == true){
							//������Ϸ״̬Ϊ����
							gameOver = true;
							//�����ڵĶ���ȫ����ֹ
							return;//break������ǰѭ����return������ǰ������
							
						}
						//�������
						if(bird.x == column1.x+column1.w|| bird.x == column2.x+column2.w) {
							score  ++;
							
						}
						try {
							Thread.sleep(30); //ÿ�ƶ�һ����Ϣһ����
							
							repaint();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
	     
			}
}