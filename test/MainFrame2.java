import javax.swing.*;//JPanel���ڵİ������
import java.awt.*; //JFrame���ڵİ�������
import java.util.LinkedList; 
import java.util.Timer;//��ʱ����
import java.util.TimerTask;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame2 extends JFrame{
	private Snake snake;//���ԣ���Ա��������
	private JPanel jPanel;//��Ϸ����
	private Timer timer;//��ʱ������ָ����ʱ���ڵ������ƶ��ķ���
	private Node food;//ʳ��

	//����������󣬳�ʼ���������
	public MainFrame2(){
		//��ʼ������
		initFrame();
		//��ʼ����Ϸ����
		initGamePanel();
		//��ʼ����
		initSnake();
		//��ʼ��ʳ��
		initFood();

		//��ʼ����ʱ��
		initTimer();
		//���ü��̼��������������������ҷ����ƶ�
		setKeyListener();
	}
	//����ʳ��
	private void initFood(){
		food=new Node();
		food.random();
	}

	//���ü��̼���
	private void setKeyListener(){
		addKeyListener(new KeyAdapter(){ //��Ӱ���������
			@Override //Override��һ�ֱ��ע�����ͣ���Ӧ���ڷ����������߱������÷����ǳ�����һ�������ĸ��ǡ�
			//@Override :α����,��ʾ��д(��Ȼ��дҲ���Ը���)�������Ϻ������⸲��ǰ�󷽷��Ĳ��������Ƿ���ͬ��
			//Overload�����ص���˼��Override�Ǹ��ǵ���˼��Ҳ������д��
			//��дOverride��ʾ�����еķ��������븸���е�ĳ�����������ƺͲ�����ȫ��ͬ��ͨ�����ഴ����ʵ����������������ʱ�������������еĶ��巽�������൱�ڰѸ����ж�����Ǹ���ȫ��ͬ�ķ����������ˣ���Ҳ����������̵Ķ�̬�Ե�һ�ֱ��֡�
				public void keyPressed(KeyEvent e){//KeyEvent����jre���㰴��/�ͷż��̰����İ�װ
					//������ÿһ������һ�����
					//System.out.println(e.getKeyCode());
					/*
					KeyListener ��java �е�һ���ӿڣ����ڽ��ռ����¼������������������ӿڡ�ּ�ڴ�������¼�����
					Ҫôʵ�ִ˽ӿڣ�������������з�������Ҫô��չ����KeyAdapter �ࣨ����д���õķ�������
					Ȼ��ʹ�������addKeyListener �������Ӹ���������������������������ע�ᡣ
					���¡��ͷŻ�����ʱ���ɼ����¼���Ȼ����������������е���ط���������KeyEvent ���ݸ�����
					*/
				switch (e.getKeyCode())
					{
					case KeyEvent.VK_UP://��
						if(snake.getDirection()!=Direction.DOWN)//����ߵ��˶������£����������ߡ�
						snake.setDirection(Direction.UP);
						break;
					case KeyEvent.VK_DOWN://��
						if(snake.getDirection()!=Direction.UP)//����ߵ��˶������ϣ����������ߡ�
							snake.setDirection(Direction.DOWN);
						break;
					case KeyEvent.VK_LEFT://��
						if(snake.getDirection()!=Direction.RIGHT)//����ߵ��˶������ң����������ߡ�
						snake.setDirection(Direction.LEFT);
						break;
					case KeyEvent.VK_RIGHT://��
						if(snake.getDirection()!=Direction.LEFT)//����ߵ��˶�����������������
						snake.setDirection(Direction.RIGHT);
						break;
					
					}
				}

		});
	}

	//��ʼ����ʱ��
	private void initTimer(){
		//������ʱ������
		timer=new Timer();
		//��ʼ����ʱ����
		TimerTask timerTask=new TimerTask(){
			@Override
				public void run(){
				snake.move();
				//�ж���ͷ�Ƿ��ʳ���غ�
				Node head=snake.getBody().getFirst();
				if (head.getX()==food.getX()&&head.getY()==food.getY())
				{
					snake.eat(food);
					//food.random();
				}
				
								//�ػ�����
				jPanel.repaint();
				}
		};
		//ÿ100���룬ִ��һ�ζ�ʱ����
		timer.scheduleAtFixedRate(timerTask,0,100);

	} 

	private void initSnake(){
		snake=new Snake();
	}
	
	private void initGamePanel(){
		jPanel = new JPanel(){
			//paint������������������
			@Override//���ط���paint��
				public void paint(Graphics g){
					g.clearRect(0,0,600,600);
					//g.clearRect();
					//���û�����ɫ
					g.setColor(Color.red);
					//g.drawRect(80,100,40,25);
				
					//����40�����ߣ��������꣬��������꣬�յ�����꣬�յ������꣩
					for (int i=0;i<=40 ;i++ )
						g.drawLine(0,15*i,600,15*i);
					//����40������
					for (int i=0; i<=40;i++ )
						g.drawLine(15*i,0,15*i,600);
					//������
					LinkedList<Node> body=snake.getBody();
					
					for (Node node :body)
					{
						g.fillRect(node.getX()*15,node.getY()*15,15,15);//����С���
					}
					
					//����ʳ��
					g.fillRect(food.getX()*15,food.getY()*15,15,15);
				}
		};
		add(jPanel);//������̵����塣
	}

	//1.��ʼ���������
	private void initFrame(){
		//���ô������
		setTitle("�հ�Ժ̰����");
		//���ô����С
		setSize(610,640);
		//���ô���λ��
		setLocation(400,400);
		//���ô����С���ܸı�
		setResizable(false);
		//���ô���رհ�ť�����ã��������˳�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		//�������壬����ʾ����Ļ�ϡ�
		new MainFrame2().setVisible(true);
		/* MainFrame2 a=new MainFrame2();
		a.setVisible(true);
		*/
	}
	

}
