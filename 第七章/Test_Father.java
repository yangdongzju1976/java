//父类
 class Father{
//父类有一个打孩子方法
	public void hitChild(){
		System.out.println("我要打孩子！");
	}
}
//子类1
 class Son1 extends Father{
//重写父类打孩子方法
	public void hitChild(){
		System.out.println("为什么打我？我做错什么了！");
	}
	public void Cry(){
		System.out.println("我哭了！！！");
	}
}
//子类2
 class Son2 extends Father{
//重写父类打孩子方法
	public void hitChild(){
		System.out.println("我知道错了，别打了！");
	}
}
//子类3
 class Son3 extends Father{
//重写父类打孩子方法
	public void hitChild(){
		System.out.println("我跑，你打不着！");
	}
}
 class Son4 extends Father{
//重写父类打孩子方法
	//public void hitChild(){
		//System.out.println("我跑，你打不着！");
	//}
}
//测试类
public class Test_Father{
	public static void main(String args[]){
		Father father;
	
		father = new Son1();
		father.hitChild();
		//father.Cry();  错的，父类没有这个方法。父类引用不能调用父类没有的方法。
	
		father = new Son2();
		father.hitChild();
	
		father = new Son3();
		father.hitChild();

		father = new Son4();//如果子类中没有重写这个方法，则调用父类中的方法。
		father.hitChild();
	}
}
/*
Java里没有多继承，一个类之能有一个父类。而继承的表现就是多态。一个父类可以有多个子类，
而在子类里可以重写父类的方法（例如方法print()），这样每个子类里重写的代码不一样，
自然表现形式就不一样。这样用父类的变量去引用不同的子类，在调用这个相同的方法print()的时候
得到的结果和表现形式就不一样了，这就是多态，相同的消息（也就是调用相同的方法）会有不同的结果.

都调用了相同的方法，出现了不同的结果！这就是多态的表现！

 定义一个父类类型的引用指向一个子类的对象既可以使用子类强大的功能，又可以抽取父类的共性。

所以，父类类型的引用可以调用父类中定义的所有属性和方法，而对于子类中定义而父类中没有的方法，它是无可奈何的；

对于父类中定义的方法，如果子类中重写了该方法，那么父类类型的引用将会调用子类中的这个方法，这就是动态连接。
*/