//��������
import java.util.LinkedList; 

public class Snake{

	//��ͷ�˶��ķ���Ĭ������
	private Direction direction=Direction.DOWN;

	//����Snake ���ʾ������һ�����ж���ڵ㣬ʹ��LinkedList���ϴ洢Node�ڵ㣬�߳�����ʱ����3���ڵ㡣
	private LinkedList<Node> body=new LinkedList<>();
	
	//���Ƿ����
	private boolean isLiving=true;

	//�����߶���ʱ����ʼ������
	public Snake(){
		initSnake();
	}

	//��ʼ������6���ڵ�
	public void initSnake(){
		//�����ߵ�����
		body=new LinkedList<>();
		body.add(new Node(16,20));
		body.add(new Node(17,20));
		body.add(new Node(18,20));
		body.add(new Node(19,20));
		body.add(new Node(20,20));
		//body.add(new Node(21,20));
	}

	//��ȡ����
	public LinkedList<Node> getBody(){
		return body;
	}
   //�ƶ��ķ��������ԡ���������ÿ���ƶ�����ͷ���з�������һ���ڵ㣬��ɾ�����һ���ڵ�
	public void move(){
		//��ȡ��ͷ�Ľڵ�
		Node head=body.getFirst();
		// body.removeLast();
		//�µ���ͷ���
		Node newHead=null;
		//����ƶ��ķ���
		if (isLiving)
		{
		
		switch (direction)
		{
			case UP:
				//����ͷ���������ӽ��
				newHead=new Node(head.getX(),head.getY()-1);
				body.addFirst(newHead);
				break;
			case DOWN:
				newHead=new Node(head.getX(),head.getY()+1);
				body.addFirst(newHead);
				break;
			//��������ƶ�
			case LEFT:
				//�����µ���ͷ���
			    newHead=new Node(head.getX()-1,head.getY());
				//���µ���ͷ������ӵ�body�ĵ�һ��Ԫ��
				body.addFirst(newHead);
				break;
			case RIGHT:
				newHead=new Node(head.getX()+1,head.getY());
				body.addFirst(newHead);
			    break;

		}
		body.removeLast();
		}
		//�ж����Ƿ�ײǽ
		head=body.getFirst();
		if (head.getX()<0||head.getY()<0||head.getX()>40||head.getY()>40)
			isLiving=false; //������ȥ
		//�ж����Ƿ�ҧ���Լ�
		Node node=new Node();
		for (int i=1;i<body.size() ;i++ ){
				node=body.get(i);
			if (head.getX()==node.getX()&&head.getY()==node.getY())
				isLiving=false;	
		}
		
	}
	
	//��ȡ���Եķ���
	public Direction getDirection(){
		return direction;
	}

	//�������Եķ���
	public void setDirection(Direction direction){
		this.direction=direction;
	}
	//��ʳ��,����ͷ�ķ�������һ�����
	public void eat(Node food){
		//Node head=body.getFirst(); 
		switch (direction)
		{
			case UP:
				//����ͷ���������ӽ��
				//newHead=new Node(head.getX(),head.getY()-1);
				body.addFirst(food);
				break;
			case DOWN:
				//newHead=new Node(head.getX(),head.getY()+1);
				body.addFirst(food);
				break;
			//��������ƶ�
			case LEFT:
				//�����µ���ͷ���
			   // newHead=new Node(head.getX()-1,head.getY());
				//���µ���ͷ������ӵ�body�ĵ�һ��Ԫ��
				body.addFirst(food);
				break;
			case RIGHT:
				//newHead=new Node(head.getX()+1,head.getY());
				//body.addFirst(newHead);
				body.addFirst(food);
			    break;

		}
		
	}

}