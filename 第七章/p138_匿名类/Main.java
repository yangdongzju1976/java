/*
匿名类有两种实现方式：
继承一个类，重写其方法。
实现一个接口（可以是多个），实现其方法。

*/

interface Polygon {
   public void display();
	//public void a();
}

class AnonymousDemo {
   public void createClass() {

      // 匿名类实现一个接口
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("在匿名类内部。");
         }
		 public void a()
		  {
			System.out.println("a。");
		  }
      };
      p1.display();
	  p1.a();
   }
}

public class Main {
   public static void main(String[] args) {
      AnonymousDemo an = new AnonymousDemo();
      an.createClass();
   }
}