interface Polygon {
   public void display();
}

class AnonymousDemo {
   public void createClass() {

      // ������ʵ��һ���ӿ�
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("���������ڲ���");
         }
      };
      p1.display();
   }
}

public class Main {
   public static void main(String[] args) {
      AnonymousDemo an = new AnonymousDemo();
      an.createClass();
   }
}