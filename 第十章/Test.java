//定义一个泛型类，并定义如下两个方法
public class Test<T>
{	public  void show(T t){
		System.out.println(t);
	}
     public void print(T t){
    	System.out.println(t);
  }	
  /*  以前是这样定义，现在一个方法搞定
  	public void show(String t){	
	}
	public void show(Integer t){	
	}
	或者
	public void show(Object obj){	
	}
  */


//在manin方法代码如下
	public static void main(String[] args) {
	   
		Test<String> d = new Test<String>();
		d.show("java");
		d.print("Object-C");
		
		Test<Integer> e = new Test<Integer>();
		e.show(2);
		e.print(new Integer(5));	
	}
	}