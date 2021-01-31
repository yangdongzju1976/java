import javax.swing.*;//JPanel
import java.awt.*;//��ɫ��ͼ�Ρ�����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
public class GamePanel extends JPanel{
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
	//����ʳ�������.
	int foodX;	//������
	int foodY;	//������
	//�������
	int scores;
	//�����ʼ��״̬
	boolean isStart;
	//����С�ߵ�����
	boolean isDie;
	//����һ����ʱ��
	Timer timer;
	//����һ����ʼ��������������ʼ��С�ߵ�����
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
		//ʳ���ֵ
		foodX=25;  //25
		foodY=75;  //75
		//���ֳ�ֵ
		scores=0;
		//��ʼ������״̬
		isDie = false;
	}
	//���幹����
	public GamePanel(){
		//��ʼ������
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
						if (isDie)
						{
							init();//���³�ʼ����������isDie��״̬��Ϊflase
						}
						else{
						isStart=!isStart;
						//repaint();//ˢ����� JPanel��һ������
						}
					}
					if (keyCode==KeyEvent.VK_UP)
					{
						direction="U";
					}
					if (keyCode==KeyEvent.VK_DOWN)
					{
						direction="D";
					}
					if (keyCode==KeyEvent.VK_LEFT)
					{
						direction="L";
					}
					if (keyCode==KeyEvent.VK_RIGHT)
					{
						direction="R";
					}
				}
		});
		//��ʼ����ʱ��
		timer = new Timer(100,new ActionListener(){
			//ÿ100���룬ִ��һ��actionPerformed���������
			@Override  //α����,��ʾ��д��(��Ȼ��д@OverrideҲ����)�����������Ը�����֤@Override����ķ�����
					  //�Ƿ����㸸�������еģ����û���򱨴���
						//���磬�����ûд@Override����������ķ�������д���ˣ���ʱ��ı������ǿ��Ա���ͨ���ģ�
						//��Ϊ��������Ϊ�������������������Լ����ӵķ�����
				public void actionPerformed(ActionEvent e){
					if (isStart && isDie==false ){//��Ϸ��ʼ��С������
						//�ı��ߵ����꣬�Ӻ�һ���ߵ�ǰһ�ڡ�
						//��������
						for (int i=length-1;i>0 ;i-- ){
							snakeX[i]=snakeX[i-1];
							snakeY[i]=snakeY[i-1];
						}
						//��ͷ����
						switch (direction){
							case "U"://snakeX[0]=snakeX[0];
									 snakeY[0]=snakeY[0]-25;
									 break;
							case "D"://snakeX[0]=snakeX[0];
									 snakeY[0]=snakeY[0]+25;
									 break;
							case "L":snakeX[0]=snakeX[0]-25;
									 //snakeY[0]=snakeY[0];
									 break;
							case "R":snakeX[0]=snakeX[0]+25;
									 //snakeY[0]=snakeY[0];
									 break;

						
						}
						//����С�ߵı߽�,���������߽����һ�˳�����
						//������X����Ч��Χ��[25,750]֮,������Y����Ч��Χ��[75,725]֮��.���ұ�25������25*[1,30],25*[3,29]��
						if (snakeX[0]<25){  
							snakeX[0]=750;
						}
						if (snakeX[0]>750)
						{
							snakeX[0]=25;
						}
						if (snakeY[0]<75)
						{
							snakeY[0]=725;
						}
						if (snakeY[0]>725)
						{
							snakeY[0]=75;
						}
						//ʹ����������������ʳ�
						Random r=new Random();
						if (foodX == snakeX[0] && foodY == snakeY[0]) //��ʳ��
						{
							length++;
							scores+=10;
							foodX = r.nextInt(29)*25+25; //r.nextInt()������������ڣ�0~29��֮��foodX��������[25,750]֮�䲢�ұ�25������
							foodY = r.nextInt(27)*25+75;
							//foodY = ((int))(Math.random()*29+3)*25;
							//Math.random()  [0.0,1.0)֮�����
							//��int)(Math.random()*29)  -->[0,28]
							//��int)(Math.random()*29)+ -->[1,29]
						}

						//����߳Ե��Լ�����������
						for (int i=1;i<length ;i++ )
						{
							if (snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i])
							{
								isDie=true;
							
							}
						}

						//ˢ��ҳ��
						repaint();
					}
					
					//System.out.println("hello");
				}
			
		});
		//��ʱ������
		timer.start();
	}


	@Override 
		//paintComponent()��swing��һ���������൱��ͼ�ΰ��main()���ǻ���ִ�еġ�
	    //���һ��class���й��캯������ִ��˳������ִ�й��캯������ִ�������
		protected void paintComponent(Graphics g){//Graphics g ���ʡ�repaint()���ô˷���
			//���û���
			super.paintComponent(g);//���ø���ķ���
			//����ǰ������ñ���ɫ
			this.setBackground(new Color(153,205,205));//RGB��Ԫɫ��ֵ
			//��һ��ˮӡͼƬ
			Images.headerImg.paintIcon(this,g,10,10);//�������this������ϣ��û���g,�����꣨10��10������ͼƬheader.png
			g.setColor(new Color(153,153,105));
			//����Ϸ���壬Ĭ�Ϻ�ɫ
			g.fillRect(10,70,770,685);
			//������ɫ
			g.setColor(Color.red);
			//����40�����ߣ��������꣬��������꣬�յ�����꣬�յ������꣩
			 for (int i=3;i<=34 ;i++ )
				g.drawLine(25,25*i,775,25*i);
			//����40������
			for (int i=1; i<=31;i++ )
				g.drawLine(25*i,75,25*i,750);
			
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
			if (isStart==false &&!isDie ){//��Ϸ��ͣ
				//�������һ������
				g.setColor(new Color(220,0,0));//������ɫ
				g.setFont(new Font("����",Font.BOLD,40));//��������
				g.drawString("����ո�ʼ��Ϸ",250,330);//�������֡����꣨250��330��
			}
			
			//��ʳ��
			Images.foodImg.paintIcon(this,g,foodX,foodY);
			//������
				g.setColor(new Color(255,255,255));//������ɫ
				g.setFont(new Font("����",Font.BOLD,20));//��������
				g.drawString("����Ϊ��"+scores,620,40);//�������֡����꣨250��330��
			
			if (isDie)
			{
				g.setColor(new Color(220,0,0));//������ɫ
				g.setFont(new Font("΢���ź�",Font.BOLD,20));//��������
				g.drawString("С����������Ϸ����.���ո����¿�ʼ��Ϸ",150,330);
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