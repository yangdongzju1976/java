import java.util.*;
class  A 
{
	@Override
		public boolean equals(Object obj)
	{
		return true;
	}
}
class B
{
	@Override
		public int hashCode(){
			return 100;
		}
}
class C
{
	@Override
		public boolean equals(Object obj){
			return true;
		}
	@Override
		public int hashCode(){
			return 200;
		}
}
public class HashSetDemo1
{
	public static void main(String[] args){
		Set <Object> set=new HashSet<>();
		set.add(new A());
		set.add(new A());
		set.add(new B());
		set.add(new B());
		set.add(new C());
		set.add(new C());
		set.add(new C());
		set.add(new C());
		set.add(new C());
		set.add(123);
		set.add(123);
		set.add("123");
		set.add("helloWorld");
		System.out.println(set);
	}
}