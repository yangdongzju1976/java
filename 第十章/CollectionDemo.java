import java.util.ArrayList; // 引入 ArrayList 类
import java.util.Iterator; // 引入 Iterator 类
public class CollectionDemo
{
	public static void main(String[] args){
		ArrayList list = new ArrayList(); //书上例子没有指定String类型
		method(list);
		//通过迭代器取出数据
		Iterator it = list.iterator();
		while (it.hasNext())
		{
			String str = (String)it.next();//强制类型转换
			System.out.println(str);    //Integer.toString(i);
		}
		//直接访问
		System.out.println("\n直接访问："+list.get(1)); 
		//修改元素
		list.set(2, "赵子龙");
		System.out.println("\n访问修改后的元素："+list.get(2)); 
		//删除元素
		list.remove(2); 
		//输出整个数组
		System.out.println("\n整个数组"+list);
		//元素个数
		System.out.println("\n元素个数："+list.size());
		//通过循环遍历整个数组
		
		System.out.println("\n通过循环遍历整个数组：\n");
		for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
	}
	}
	public static void method(ArrayList list){
		//添加数据
		list.add("关羽");
		list.add("张飞");
		list.add("赵云");
		list.add("黄忠");
		list.add("马超");
	    list.add(123);
		}
}
/*
ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，
我们可以添加或删除元素。
ArrayList 继承了 AbstractList ，并实现了 List 接口。

迭代器 it 的两个基本操作是 next 、hasNext 和 remove。
调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
调用 it.hasNext() 用于检测集合中是否还有元素。
调用 it.remove() 将迭代器返回的元素删除。

迭代是重复反馈过程的活动，其目的通常是为了逼近所需目标或结果。
每一次对过程的重复称为一次“迭代”，而每一次迭代得到的结果
会作为下一次迭代的初始值。
*/