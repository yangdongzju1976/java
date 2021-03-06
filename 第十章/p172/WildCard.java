import java.util.ArrayList; // 引入 ArrayList 类
import java.util.Iterator; // 引入 Iterator 类
public class WildCard{

	public static void main(String[] args) 
	{
		//1。
		ArrayList<String> a1=new ArrayList<String>();//ArrayList<>()
		a1.add("abc");
		a1.add("hehe");
		//2。
		ArrayList<String> a2=new ArrayList<String>();//ArrayList<>()
		a2.add("def");
		a2.add("haha");
		
		//迭代器
		System.out.println("\n通过迭代器直接输出a1\n");
		Iterator<String>it1=a1.iterator();
		while (it1.hasNext()){
			System.out.println(it1.next());
		}

		//迭代器
		System.out.println("\n通过迭代器直接输出a2\n");
		Iterator<String>it2=a2.iterator();
		while (it2.hasNext()){
			System.out.println(it2.next());
		}
		//调用
		System.out.println("\n调用printCollection()方法输出a1\n");
		printCollection(a1);
		System.out.println("\n调用printCollection()方法输出a2\n");
		printCollection(a2);
		//3。整形
		ArrayList <Integer> a3=new ArrayList<>();
			a3.add(1234);
			a3.add(5678);
		//报错 类型不匹配
		//printCollection(a3);
		System.out.println("\n调用printCollection1()方法输出a1\n");
		printCollection1(a1);
		System.out.println("\n调用printCollection1()方法输出a2\n");
		printCollection1(a2);
		System.out.println("\n调用printCollection1()方法输出a3\n");
		printCollection1(a3);
		

	}
	//1。
	public static void printCollection(ArrayList<String>a){//static ?
		Iterator<String>it=a.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
	//2。通配符
	public static void printCollection1(ArrayList<?>a){//static ?
		Iterator<?>it=a.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
