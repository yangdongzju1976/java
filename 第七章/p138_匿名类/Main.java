/*
������������ʵ�ַ�ʽ��
�̳�һ���࣬��д�䷽����
ʵ��һ���ӿڣ������Ƕ������ʵ���䷽����

*/

interface Polygon {
   public void display();
	//public void a();
}

class AnonymousDemo {
   public void createClass() {

      // ������ʵ��һ���ӿ�
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("���������ڲ���");
         }
		 public void a()
		  {
			System.out.println("a��");
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