import java.util.*;
/*
  1.ArrayList就是传说中的动态数组
  2.实现了ICollection和List接口
  3.灵活的设置数组的大小
  4.数组是静态的，数组被初始化之后，数组长度就不能再改变了。ArrayList是可以动态改变大小的。
  5.什么时候使用Array（数组），什么时候使用ArrayList?
	答案是：当我们不知道到底有多少个数据元素的时候，就可使用ArrayList；
	如果知道数据集合有多少个元素，就用数组。
  6.Arraylist()　　这个构造方法构造了一个空的链表。
  7.ArrayList(Collection<? extends E> c)　　
	这个构造方法构造了一个包含指定元素集合的链表，注意，这里的字符E是一个标记，
	用来表示集合中元素的类型。至于具体是什么类型，需要你在使用这个构造方法的时候来指定。
  8.ArrayList类只支持对象类型，不支持 基础数据类型。就是说ArrayList对象只能存放对象，不能存放基础数据类型的数据。
*/
public class test
{
	public static void main(String[] args) {
    ArrayList <String>list1 = new ArrayList<>(); // 创建集合 list1 创建一个空的数组链表，用来存放String类型的对象，
    ArrayList <String> list2 = new ArrayList<>(); // 创建集合 list2
	/*
	创建一个指定初始容量的数组链表，你可以像下面这样做：
　　ArrayList<Integer> list = new ArrayList<Integer>(7);
	*/
    list1.add("one"); // 向 list1 添加一个元素
    list1.add("two"); // 向 list1 添加一个元素
	list1.add(0,"zero");//在指定位置插入元素
    list2.addAll(list1); // 将 list1 的所有元素添加到 list2
    list2.add("three"); // 向 list2 添加一个元素
    System.out.println("list2 集合中的元素如下：");
   Iterator it1 = list2.iterator();
   System.out.print(it1.next());
    while (it1.hasNext()) {
        System.out.print("、"+it1.next()  );
    }
	System.out.println("\n\n");
	
}
}
