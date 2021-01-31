  class Test2 
{
  int age;
	void setAge(int i)
	{
		age=i;
	}


} 
public  class TestChild extends Test2

{   //int age;
	
	public static void main(String[] args) 
	{ 
		TestChild a=new TestChild();
		a.setAge(10);		//父类的方法。
	
	a.eat();
	}
	void eat()
	{
		super.age=12;
		System.out.println("age="+super.age);
	}
}
