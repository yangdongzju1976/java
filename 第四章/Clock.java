import java.util.Scanner;
public class Clock 
{
	static int a=6;
	int c=11;
	public static void main(String[] args) 
	{	 Clock_test x=new Clock_test();
		x.a=10;
		int b=10;
		//static c=11;
		//a=in.nextInt();
		System.out.println(a);
		System.out.println(x.a);
		//System.out.println(c);

	}
}

class Clock_test
{	
	int a;
	int getUp=11;//在整个Clock_test对象内有效
	{
		int goBed=11; //局部变量，只在{}内有效
	}
	public void print_(){
		System.out.println(getUp);//输出
		//System.out.println(goBed); 编译出错。

	}

}
