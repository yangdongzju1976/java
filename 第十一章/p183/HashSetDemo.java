import java.util.*;
public class HashSetDemo 
{
	public static void main(String[] args){
	Set<String> strSet = new HashSet<>();//new了一个HashSet,在堆内存里开辟了一块空间
	strSet.add("张三");
	strSet.add("李四");
	strSet.add("王五");
	strSet.add("赵六");
		
	System.out.println("strSet : " + strSet);
	System.out.println("strSet.size() : " + strSet.size());
	System.out.println("strSet里是否为空 : " + strSet.isEmpty());
		
	System.out.println("删除王五。。。。");
	boolean delFlag = strSet.remove("王五");
	System.out.println("删除王五是否成功" + delFlag);
	System.out.println("删除王五后的strSet : " + strSet);
	System.out.println("strSet中是否包含王五：" + strSet.contains("王五"));
	System.out.println("strSet中是否包含张三：" + strSet.contains("张三"));
		
	System.out.println("clear清除元素...");
	strSet.clear();
	System.out.println("clear清除元素后的strSet : " + strSet);
	System.out.println("strSet长度 : " + strSet.size());
	System.out.println("strSet里是否为空 : " + strSet.isEmpty());
		
}
}
/*
HashSet是Java集合Set的一个实现类，Set是一个接口，其实现类除HashSet之外，
还有TreeSet，并继承了Collection，HashSet集合很常用
*/