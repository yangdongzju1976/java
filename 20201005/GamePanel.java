//�Ե��Լ�����
//�Ƿ�

import javax.swing.*;//JPanel
import java.awt.*;//��ɫ��ͼ�Ρ����� Graphics
import java.awt.event.*;
/*import java.awt.event.ActionEvent;
ActionEvent����һ���¼������¼�Ϊִ�ж����¼�ACTION_PERFORMED.��������¼�
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;  KeyAdapter����һ�������ࣨ�����������ڽ��ռ����¼������������з������ǿյġ�������Ƿ�����ഴ������������
//���������ĸ����У����еĶ�����ͨ���������ģ����Ƿ����������������е��඼������������ģ����һ������û�а����㹻����Ϣ�����һ������Ķ�������������ǳ����ࡣ
import java.awt.event.KeyEvent;

*/
import java.util.Random;
public class GamePanel extends JPanel{
	//�����ߵ�����
	//���ߵ�����X����浽һ��������
	int snakeX[]=new int[500];
	//���ߵ�����Y����浽һ��������
	int snakeY[]=new int[500];
	//�����ߵĳ���
	int length;
	//����һ����ʱ��
	Timer timer;
	//����С�ߵ����߷���
	String direction;
	//����ʳ�������  4
	int foodX;
	int foodY;
	
	//�趨С�ߵ�״̬�����ո��ֹͣ���ٰ��ո����ʼ
	boolean isStart;
	//С�ߵĴ���״̬
	boolean isDie;
	//��ʼ��С��
	public void init(){
		//��ʼ����ͷ
		snakeX[0]=200;
		snakeY[0]=200;
		//��ʼ���ߵ�һ��
		snakeX[1]=175;
		snakeY[1]=200;
		//��ʼ���ߵڶ���
		snakeX[2]=150;
		snakeY[2]=200;
		//�ߵĳ���
		length=3;
		//�ߵĳ�ʼ�����򣬳���
		direction="R";
		//С�ߵĿ�ʼ״̬Ϊtrue
		isStart=true;
		//С���ǻ��ŵ�
		isDie=false;
		
		//��ʼ��ʳ������  4
		foodX=200;
		foodY=200;

	} 
	


	public GamePanel(){// ��Ĺ����� �����ɶ����ʱ���Զ����С�
		//��ʼ������
		init();
		//��������Ļ�Ľ����������ϡ�
		this.setFocusable(true);
		//������̵ļ�����
		//��GamePanel�������ڸı�direction��ֵ����ʹ��ͷ�ı䷽����
		//direction="U"; //��ֵ��"R",�ı�Ϊ"U"
		//���̼�����  ---�����ڲ��ࣨ1��
		/*this.addKeyListener(new KeyAdapter(){//������ ��һ�����ж�����һ���࣬������������Ϊ�ڲ��ࡣ
			@Override
				public void keyPressed(KeyEvent e){ //����������������Ƿ��������̰�ѹ
					
				}
			});*/
			
		//���̼�����  ---������������ȡ��ֵ��2��
		this.addKeyListener(new KeyAdapter(){//������ ��һ�����ж�����һ���࣬������������Ϊ�ڲ��ࡣ
			@Override
				public void keyPressed(KeyEvent e){ 
				//����������������Ƿ��������̰�ѹ
				super.keyPressed(e);
				//��ȡ�㰴���Ĵ��롣
				int keyCode=e.getKeyCode();
					//���������ֵ
				System.out.println(keyCode);
				if (keyCode==37) direction="L"; //KeyEvent.VK_LEFT==37
				if (keyCode==38) direction="U"; //KeyEvent.VK_UP
				if (keyCode==39) direction="R"; //KeyEvent.VK_RIGHT
				if (keyCode==40) direction="D"; //KeyEvent.VK_DOWN
				//���ո���ı�С�ߵ�״̬��
				if (keyCode==32) {
					if (isDie)
						init(); //���³�ʼ����������isDie��״̬��Ϊflase
					else
					{
						isStart=!isStart;
						//repaint();
					}
					
				}
					
					
				}
			});

			
			
				
		


		//���ö�ʱ��(1) ÿ100���룬ִ��һ��actionPerformed���������
		/*timer = new Timer(100,new ActionListener(){
			@Override   //α����,��ʾ��д��(��Ȼ��д@OverrideҲ����)�����������Ը�����֤@Override����ķ�����
					  //�Ƿ����㸸�������еģ����û���򱨴���
						//���磬�����ûд@Override����������ķ�������д���ˣ���ʱ��ı������ǿ��Ա���ͨ���ģ�
						//��Ϊ��������Ϊ�������������������Լ����ӵķ�����
				public void actionPerformed(ActionEvent e){}
		});*/
		//snakeX[0]=snakeX[0]+25; ���߶�����
		//���ö�ʱ��(2) �޸�ʱ�䣨�������۲�Ч����
		/*timer = new Timer(1100,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
					System.out.println("hello");
				}
		});*/
		
		//���ö�ʱ��(3) ���������ߵ����꣬���߶�������
		timer = new Timer(100,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
				//С���˶�  ��0�� �ж϶�ʱ���Ƿ�������
				//System.out.println("hello");
				//�ж�С�ߵ�״̬  С���˶�----���һ��
				if (isStart&&!isDie)
				{
					//
				//������
				//snakeX[0]+=25;
				//������
				//snakeX[0]-=25;
				//������
				//snakeY[0]-=25;
				//������
				//snakeY[0]+=25;
			
				//snakeY[0]=snakeY[0]+125;
				
					//С���˶�  ��2��
				/*for (int i=length-1;i>0 ;i-- ){
							snakeX[i]=snakeX[i-1];
							snakeY[i]=snakeY[i-1];
						}
					//��ͷ����
					snakeX[0]=snakeX[0]+25;*/
				
				//���˶���1��
				//��ͷ����
				//snakeX[0]=snakeX[0]+25;
				//������
				//snakeX[1]=snakeX[1]+25;
				//snakeX[2]=snakeX[2]+25;
				
				//���˶���2�� ����
				for (int i=length-1;i>0 ;i-- )
				{
					snakeX[i]=snakeX[i-1];
					snakeY[i]=snakeY[i-1];
				}
				
				//�ж��ߵ��˶�����  ͷ
				switch (direction)
				{
				case "U": snakeY[0]-=25;break;//������
				case "D": snakeY[0]+=25;break;//������
				case "R": snakeX[0]+=25;break;//������
				case "L": snakeX[0]-=25;break;//������
				}

				//�ж��Ƿ�Խ��
				//����С�ߵı߽�,���������߽����һ�˳�����
				//������X����Ч��Χ��[25,750]֮,������Y����Ч��Χ��[75,725]֮��.���ұ�25������25*[1,30],25*[3,29]��
				
				//������Խ����������
				if (snakeX[0]>750)
					snakeX[0]=25;
				//������Խ�����Ҳ����
				if (snakeX[0]<25)
					snakeX[0]=750;
				//����Խ����δ�����ѧ���Լ�д��
				//��Խ�磬���������
				if (snakeY[0]<75)
					snakeY[0]=725;
				//��Խ�磬���������
				if (snakeY[0]>725)
					snakeY[0]=75;

				//��ʳ�������ʧ����1��
				/*if (snakeX[0]==foodX&&snakeY[0]==foodY)
				{
					length++;
					foodX=-1;
					foodY=-1;
				}
				*/
				//��ʳ�����֮�����������һ��ʳ��
				Random r=new Random();
				if (snakeX[0]==foodX&&snakeY[0]==foodY)
				{
					length++;
					foodX=r.nextInt(30)*25+25;    //foodX��������[25,750]֮��25�ı��� r.nextInt(30)����[0,30)֮�������
					foodY=r.nextInt(27)*25+75;//foodY��������[75,725]֮��25�ı�����r.nextInt(27)����[0,27)֮�������
				}
				
				//�߳Ե��Լ����� ��5��
				for (int i=1;i<length ;i++ )
				{
					if (snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i])  //�Ե��Լ�������
					{
						isDie=true;
					}
				}
				//ˢ��ҳ��
						repaint();
				//�����������ǽ������

				}// if
				}
		});

		//��ʱ������
		timer.start();

	}
	


	
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
			
			//���û�����ɫ
			g.setColor(Color.red);
			//����40�����ߣ��������꣬��������꣬�յ�����꣬�յ������꣩
			for (int i=3;i<=32 ;i++ )
				g.drawLine(25,25*i,775,25*i);
			//����40������
			for (int i=1; i<=31;i++ )
				g.drawLine(25*i,75,25*i,750);
			
			//���
			//g.fillRect(100,100,100,100);

			//����  ��ʳ��󲻳���
			g.fillRect(snakeX[0],snakeY[0],25,25);
			g.setColor(Color.green);
			g.fillRect(snakeX[1],snakeY[1],25,25);
			g.fillRect(snakeX[2],snakeY[2],25,25);
			
			//����  ��ʳ��󳤴�
			//����ͷ
			/*g.fillRect(snakeX[0],snakeY[0],25,25);
			//��ɫ
			g.setColor(Color.green);
			//������
			for (int i=1;i<length ; i++)
			{
				g.fillRect(snakeX[i],snakeY[i],25,25);

			}
			
			*/

			//��ʳ�� ʳ�ﱻ����֮����ʧ ��1��
		/*	if (foodX==-1)
			{
				//ʳ����ʧ
				g.setColor(new Color(179,231,240));
				g.fillRect(foodX,foodY,25,25);
			}
			else{
			g.setColor(Color.BLUE);
				//g.setColor(new Color(255,100,200));
			g.fillRect(foodX,foodY,25,25);
			}
		*/
			//��ʳ��
			g.setColor(Color.BLUE);
				//g.setColor(new Color(255,100,200));
			g.fillRect(foodX,foodY,25,25);

			/*for (int i=0;i<length ;i++ )
			{
				g.fillRect(snakeX[i],snakeY[i]+100,25,25);
			}*/


			//��ʾ��Ϸֹͣ״̬
			if (!isStart ){//��Ϸ��ͣ
				//�������һ������
				g.setColor(new Color(220,0,0));//������ɫ
				g.setFont(new Font("����",Font.BOLD,40));//��������
				g.drawString("����ո�ʼ��Ϸ",250,330);//�������֡����꣨250��330��
			}
			//��ʾС��������״̬
			if (isDie)
			{
				g.setColor(new Color(220,0,0));//������ɫ
				g.setFont(new Font("΢���ź�",Font.BOLD,30));//��������
				g.drawString("С����������Ϸ����.���ո����¿�ʼ��Ϸ",150,330);
			}
			//������д����
				g.setColor(new Color(0,0,0));//������ɫ
				g.setFont(new Font("����",Font.BOLD,30));//��������
				g.drawString("̰����----�հ�Ժ2019���Ƽ���רҵ����",115,45);//�������֡����꣨250��330��

			//�÷�
				g.setColor(new Color(255,0,0));//������ɫ
				g.setFont(new Font("����",Font.BOLD,20));//��������
				g.drawString("�÷֣�"+100,685,65);//�������֡����꣨250��330��

			//ˢ��ҳ�档�����ˢ��ҳ�棬��ʹ�޸��ߵ����꣬��Ȼ��ʾ�����ꡣ
			repaint();
}
}
	