import javax.swing.*;//JPanel
import java.awt.*;//��ɫ��ͼ�Ρ����� Graphics
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
/*
KeyAdapter����һ�������ࣨ�����������ڽ��ռ����¼������������з������ǿյġ�������Ƿ�����ഴ������������
//���������ĸ����У����еĶ�����ͨ���������ģ����Ƿ����������������е��඼������������ģ����һ������û�а����㹻����Ϣ�����һ������Ķ�������������ǳ����ࡣ
*/
import java.awt.event.KeyEvent;
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
	} 
	


	public GamePanel(){// ��Ĺ����� �����ɶ����ʱ���Զ����С�
		//��ʼ������
		init();
		//��������Ļ�Ľ����������ϡ�
		this.setFocusable(true);
		//���ö�ʱ��(1) ÿ100���룬ִ��һ��actionPerformed���������
		/*timer = new Timer(100,new ActionListener(){
			@Override   //α����,��ʾ��д��(��Ȼ��д@OverrideҲ����)�����������Ը�����֤@Override����ķ�����
					  //�Ƿ����㸸�������еģ����û���򱨴�
						//���磬�����ûд@Override����������ķ�������д���ˣ���ʱ��ı������ǿ��Ա���ͨ���ģ�
						//��Ϊ��������Ϊ�������������������Լ����ӵķ�����
				public void actionPerformed(ActionEvent e){}
		});*/
		//snakeX[0]=snakeX[0]+25; ���߶�����
		//���ö�ʱ��(2) �޸�ʱ�䣨�������۲�Ч����
		timer = new Timer(60,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
					//System.out.println("hello");
					int t=0;
					for (int i=length-1;i>0 ;i-- )
					{
						snakeX[i]=snakeX[i-1];
						snakeY[i]=snakeY[i-1];
					}
					
					
					
				/*	if (snakeX[0]==750&&snakeY[0]<725) //����������˵�������ұڣ����¡�
						snakeY[0]+=25;
					else if (snakeY[0]==725)
					{
						snakeX[0]-=25;
					}					//������������˵����û�е��ұڣ�������ǰ
					else if (snakeY[0]<220)
					{
						snakeX[0]+=25;

					}
						
					*/
					
				/*	if (snakeX[0]!=25&&snakeX[0]<750&&snakeY[0]<225)
						snakeX[0]+=25;
					else if (snakeY[0]<725)
					{
						snakeY[0]+=25;
					}
					else if (snakeX[0]>25)
					{
						snakeX[0]-=25;
					}
					
					if (snakeX[0]==25)
					{
						snakeY[0]-=25;
					}	
					*/
					if (snakeX[0]>100&&snakeX[0]<750&&snakeY[0]<225)
						snakeX[0]+=25;
					else if (snakeX[0]==750&&snakeY[0]>75&&snakeY[0]<725)
							snakeY[0]+=25;
						 else if (snakeY[0]==725&&snakeX[0]!=25)
									snakeX[0]-=25;
							  else if (snakeX[0]==25&&snakeY[0]!=75)
										snakeY[0]-=25;
					               else if (snakeY[0]==75&&snakeX[0]!=750)
											snakeX[0]+=25;
				      					else
											snakeY[0]+=25;

						
					
				}
		});
		
		//���ö�ʱ��(1) ���������ߵ����꣬���߶�������
	/*	timer = new Timer(100,new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent e){
				//���˶���1��
				//��ͷ����
				//snakeX[0]=snakeX[0]+25;
				//������
				//snakeX[1]=snakeX[1]+25;
				//snakeX[2]=snakeX[2]+25;
				
				//���˶���2�� ��������ߵġ�������������ͷ��
				for (int i=length-1;i>0 ;i-- )//i��length-1��1�� i-1:��length-2��0
				{
					snakeX[i]=snakeX[i-1];  //��snakeX[i-1]�滻snakeX[i]��X����
					snakeY[i]=snakeY[i-1];  //��snakeY[i-1]�滻snakeY[i]��Y����
				}
				//������
				//snakeX[0]+=25;
				//������
				//snakeX[0]-=25;
				//������
				//snakeY[0]-=25;
				//������
				snakeY[0]+=25;
				/*if (snakeY[0]==750)
				{
					snakeY[0]=100;
					
					snakeX[0]+=25;
				}*/

				//snakeY[0]=snakeY[0]+125;
				//System.out.println("hello");
				/*for (int i=length-1;i>0 ;i-- ){
							snakeX[i]=snakeX[i-1];
							snakeY[i]=snakeY[i-1];
						}
					//��ͷ����
					snakeX[0]=snakeX[0]+25;*/
			//	}
	//	});

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

			//����
			g.fillRect(snakeX[0],snakeY[0],25,25);
			g.setColor(Color.green);
			g.fillRect(snakeX[1],snakeY[1],25,25);
			g.fillRect(snakeX[2],snakeY[2],25,25);
			
			/*for (int i=0;i<length ;i++ )
			{
				g.fillRect(snakeX[i],snakeY[i]+100,25,25);
			}*/
			
			//ˢ��ҳ�档�����ˢ��ҳ�棬��ʹ�޸��ߵ����꣬��Ȼ��ʾ�����ꡣ
			repaint();
}
}
	

