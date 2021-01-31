import java.util.*;
public class TreeSetDemo
{
	public static void main(String[] args) 
	{
		Set <Object> set=new TreeSet<>();
		set.add(111);
		set.add(123);
		set.add(9);
		//set.add("a");
		System.out.println("TreeSet集合中的元素为"+set);
		
		Set <Object>set1=new TreeSet<>();//LinkedHashSet()是hashSet的子类。
		set1.add("张学友");
		set1.add("刘德华");
		set1.add("黎明");
		set1.add("郭富城");
		//hashSet.add(123);
		System.out.println("HashSet集合中的元素为"+set1);

		HashSet <Object>hashSet=new LinkedHashSet<>();//LinkedHashSet()是hashSet的子类。
		hashSet.add("张学友");
		hashSet.add("刘德华");
		hashSet.add("黎明");
		hashSet.add("郭富城");
		hashSet.add(123);
		System.out.println("HashSet集合中的元素为"+hashSet);
		

	}
}
