//创建蛇身
import java.util.LinkedList; 

public class Snake{

	//蛇头运动的方向。默认向左
	private Direction direction=Direction.DOWN;

	//创建Snake 类表示蛇身，一条蛇有多个节点，使用LinkedList集合存储Node节点，蛇出生的时候有3个节点。
	private LinkedList<Node> body=new LinkedList<>();
	
	//蛇是否活着
	private boolean isLiving=true;

	//创建蛇对象时，初始化蛇身
	public Snake(){
		initSnake();
	}

	//初始化蛇身6个节点
	public void initSnake(){
		//创建蛇的躯体
		body=new LinkedList<>();
		body.add(new Node(16,20));
		body.add(new Node(17,20));
		body.add(new Node(18,20));
		body.add(new Node(19,20));
		body.add(new Node(20,20));
		//body.add(new Node(21,20));
	}

	//获取蛇身
	public LinkedList<Node> getBody(){
		return body;
	}
   //移动的方法（属性、方法）：每次移动在蛇头运行方向添加一个节点，再删除最后一个节点
	public void move(){
		//获取蛇头的节点
		Node head=body.getFirst();
		// body.removeLast();
		//新的蛇头结点
		Node newHead=null;
		//检查移动的方向
		if (isLiving)
		{
		
		switch (direction)
		{
			case UP:
				//在蛇头的上面添加结点
				newHead=new Node(head.getX(),head.getY()-1);
				body.addFirst(newHead);
				break;
			case DOWN:
				newHead=new Node(head.getX(),head.getY()+1);
				body.addFirst(newHead);
				break;
			//如果向左移动
			case LEFT:
				//创建新的蛇头结点
			    newHead=new Node(head.getX()-1,head.getY());
				//把新的蛇头结点添加到body的第一个元素
				body.addFirst(newHead);
				break;
			case RIGHT:
				newHead=new Node(head.getX()+1,head.getY());
				body.addFirst(newHead);
			    break;

		}
		body.removeLast();
		}
		//判断蛇是否撞墙
		head=body.getFirst();
		if (head.getX()<0||head.getY()<0||head.getX()>40||head.getY()>40)
			isLiving=false; //让蛇死去
		//判断蛇是否咬到自己
		Node node=new Node();
		for (int i=1;i<body.size() ;i++ ){
				node=body.get(i);
			if (head.getX()==node.getX()&&head.getY()==node.getY())
				isLiving=false;	
		}
		
	}
	
	//获取属性的方法
	public Direction getDirection(){
		return direction;
	}

	//设置属性的方法
	public void setDirection(Direction direction){
		this.direction=direction;
	}
	//吃食物,在蛇头的方向添加一个结点
	public void eat(Node food){
		//Node head=body.getFirst(); 
		switch (direction)
		{
			case UP:
				//在蛇头的上面添加结点
				//newHead=new Node(head.getX(),head.getY()-1);
				body.addFirst(food);
				break;
			case DOWN:
				//newHead=new Node(head.getX(),head.getY()+1);
				body.addFirst(food);
				break;
			//如果向左移动
			case LEFT:
				//创建新的蛇头结点
			   // newHead=new Node(head.getX()-1,head.getY());
				//把新的蛇头结点添加到body的第一个元素
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
