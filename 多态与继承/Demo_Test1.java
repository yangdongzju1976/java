class Animal {
	int num = 10;
	static int age = 20;
	public void eat() {
		System.out.println("动物吃饭");
	}

	public static void sleep() {
		System.out.println("动物在睡觉");
	}

	public void run(){
		System.out.println("动物在奔跑");
	}
	public void catchMouse(){};
}

class Cat extends Animal {
	int num = 80;
	static int age = 90;
        String name = "tomCat";
	public void eat() {
		System.out.println("猫吃饭");
	}
	public static void sleep() {
		System.out.println("猫在睡觉");
	}
	public void catchMouse() {
		System.out.println("猫在抓老鼠");
	}

}





class Demo_Test1 {
	public static void main(String[] args) {	
	Animal am = new Cat();
	am.eat();
	am.sleep();
	am.run();
	am.catchMouse();
	//am.catchMouse();出错这里先注释掉，等会会说明
        //System.out.println(am.name);//这里先注释，待会说明
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

