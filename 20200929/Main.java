class Polygon {
   public void display() {
      System.out.println("�� Polygon ���ڲ�");
   }
}

class AnonymousDemo {
   public void createClass() {

      // ������������̳��� Polygon ��
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("���������ڲ���");
         }
      };
      p1.display();
   }
}

class Main {
   public static void main(String[] args) {
       AnonymousDemo an = new AnonymousDemo();
       an.createClass();
   }
}