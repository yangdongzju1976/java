import java.util.ArrayList;
import java.util.Vector;
 /*
 Vector ��ʵ����һ����̬���顣�� ArrayList �����ƣ����������ǲ�ͬ�ģ�

Vector ��ͬ�����ʵġ�
Vector ��������ഫͳ�ķ�������Щ���������ڼ��Ͽ�ܡ�
Vector ��Ҫ�������Ȳ�֪������Ĵ�С������ֻ����Ҫһ�����Ըı��С������������
 */
public class Main {
 
public static void main(String[] args) {
   Object testObject = new ArrayList();
      displayObjectClass(testObject);
   }
   public static void displayObjectClass(Object o) {
      if (o instanceof Vector)
      System.out.println("������ java.util.Vector ���ʵ��");
      else if (o instanceof ArrayList)
      System.out.println("������ java.util.ArrayList ���ʵ��");
      else
      System.out.println("������ " + o.getClass() + " ���ʵ��");
   }
   
}