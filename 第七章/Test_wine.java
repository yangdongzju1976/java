/*
一个java文件中可以定义多个类，但是最多只有一个类被public修饰，并且这个类的类名与文件名必须相同，
若这个文件中没有public的类，则文件名随便是一个类的名字即可。需要注意的是，当用javac指令编译
有多个类的Java文件时，它会给每一个类生成一个对应的.class 文件。
*/
public class  Test_wine{ //主类
	public static void main(String[] args) 
	{
		Wine a=new JNC(); //父类类型引用。
		a.fun1();  //相同的调用，不同的类作出响应。必须是父类中定义的方法
		a.fun4(); //a.fun2("");
		//a.fun3();//父类无此方法，编译错误
		JNC b=new JNC();
		b.fun2(" ");
		b.fun3();
		System.out.println("\n\n"+a.toString());
		System.out.println("\n\n"+b.toString());
	}
}
 class Wine{ //父类
	public void fun1(){
		System.out.println("Wine 的fun1");
		fun2();
	}
	public void fun2(){
		System.out.println("Wine 的fun2");
	}
	public void fun4(){
		System.out.println("Wine 的fun4");
	}
}
class JNC extends Wine{
	public void fun1(String a){ //重载了父类的方法。与父类方法名相同，但参数不一致。
		System.out.println("JNC的fun1..");
		fun2();
	
	}
	public void fun1(){ //重写了父类的方法。与父类方法名相同，参数一致。
		System.out.println("JNC的fun100");
		fun2();
	
	}
	public void fun2(){//重写了父类的方法。与父类方法名相同，参数一致。
		System.out.println("JNC的fun2..");
	}

	public void fun2(String a){//重载了父类的方法。与父类方法名相同，参数一致。
		System.out.println("JNC的fun2..");
	}
	public void fun3(){//子类的新方法。父类无此方法。
		System.out.println("JNC的fun3..");
	}
}
//可以定义多个子类，多个子类对同一方法的重写可以表现出不同的行为。
//当使用多态方式调用方法时，首先检查父类中是否有此方法，如果没有则编译错误，如果有则调用子类同命名方法。如果子类无此方法，则调用父类的方法。