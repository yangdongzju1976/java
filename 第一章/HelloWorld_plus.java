public class HelloWorld_plus  //定义公有类
{
	public static void main(String[] args){  //主方法，所有代码的入口
		System.out.println("Hello World!");  //表示在控制台（黑屏幕）输出一个字符串“hello world”
		
	}
}
//java所有的代码都是运行在类里面的
//public 表示这是一个可以公开访问的类
//class 表示这是一个类
//_20200910_HelloWorld 表示类的名字，每个单词的首字母大写
//你会写很多代码，总有第一行执行的代码，这就是主方法
//main()的修饰符
//public修饰符，程序都是由JVM调用的，为了让JVM自由调用main()方法，使用public修饰符将main()方法暴露出来 
//static 修饰符：JVM直接通过类来调用main()方法的，而不是通过创建对象调用的。
//void JVM 调用main()方法，则返回值由JVM接受，没有意义。
//args 表示运行参数，在本例中没有使用到。
//System是一个类，位于java.lang包下，代表当前程序的运行平台。这个类是不能进行实例化的。类中提供了一系列的静态属性和方法，用来获取平台的相关信息和行为。
//println 表示打印数据到控制台，并且换行
//