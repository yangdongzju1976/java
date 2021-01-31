import java.util.*;
import java.lang.*;
public class ExecptionDemo1  
{
	public static void main(String[] args) 
	{
		double f;
		Scanner input=new Scanner(System.in);
		System.out.println("输入f的值：");
		f = input.nextDouble();
		f=Math.sqrt(-12.5);
		System.out.println("sqrt(f)="+f);
		System.out.println("1/0="+1/0);
	}
}
/*
Java虚拟机在处理浮点数运算时，不会抛出任何运行时异常。
，当一个操作产生溢出时，将会使用有符号的无穷大来表示，
如果某个操作结果没有明确的数学定义的话，将会使用NaN值来表示，
所有使用NaN值作为操作数的算术操作，结果都返回NaN。
*/
