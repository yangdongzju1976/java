class Animal {
	int num = 10;
	static int age = 20;
	public void eat() {
		System.out.println("����Է�");
	}

	public static void sleep() {
		System.out.println("������˯��");
	}

	public void run(){
		System.out.println("�����ڱ���");
	}
	public void catchMouse(){};
}

class Cat extends Animal {
	int num = 80;
	static int age = 90;
        String name = "tomCat";
	public void eat() {
		System.out.println("è�Է�");
	}
	public static void sleep() {
		System.out.println("è��˯��");
	}
	public void catchMouse() {
		System.out.println("è��ץ����");
	}

}





class Demo_Test1 {
	public static void main(String[] args) {	
	Animal am = new Cat();
	am.eat();
	am.sleep();
	am.run();
	am.catchMouse();
	//am.catchMouse();����������ע�͵����Ȼ��˵��
        //System.out.println(am.name);//������ע�ͣ�����˵��
	System.out.println(am.num);
	System.out.println(am.age);

	System.out.println("------------------------------");
	Cat ct = (Cat)am;
	ct.eat();
	ct.sleep();
	ct.run();
	ct.catchMouse();
	}
}

