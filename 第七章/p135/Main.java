import java.util.ArrayList;
import java.util.Vector;
 /*
 Vector 类实现了一个动态数组。和 ArrayList 很相似，但是两者是不同的：

Vector 是同步访问的。
Vector 包含了许多传统的方法，这些方法不属于集合框架。
Vector 主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况。
 */
public class Main {
 
public static void main(String[] args) {
   Object testObject = new ArrayList();
      displayObjectClass(testObject);
   }
   public static void displayObjectClass(Object o) {
      if (o instanceof Vector)
      System.out.println("对象是 java.util.Vector 类的实例");
      else if (o instanceof ArrayList)
      System.out.println("对象是 java.util.ArrayList 类的实例");
      else
      System.out.println("对象是 " + o.getClass() + " 类的实例");
   }
   
}