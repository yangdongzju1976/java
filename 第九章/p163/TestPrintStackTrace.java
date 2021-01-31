import java.io.*;
 class SelfDefinedException extends Exception
{
	public SelfDefinedException()
	{
		super("自定义的例外类");
	}
}
public class TestPrintStackTrace 
{
	public static void main(String[] args) 
	{
		try
		{
			firstMethod();
		}
		catch (SelfDefinedException e)
		{
			e.printStackTrace();
		}
	}

	public static void firstMethod() throws SelfDefinedException{
		secondMethod();
	}
	public static void secondMethod() throws SelfDefinedException{
		thirdMethod();
	}
	public static void thirdMethod() throws SelfDefinedException{
		throw new SelfDefinedException();
	}
}
/*
e.printStackTrace();是打印异常的堆栈信息，指明错误原因，
当发生异常时，通常要处理异常，这是编程的好习惯，
所以e.printStackTrace()可以方便你调试程序！

e是Throwable的实例异常对象，用在catch语句中，相当于一个形参，
一旦try捕获到了异常，那么就将这个异常信息交给e，由e处理，
printStackTrace()是异常类的一个方法。与它重载的方法还有printStackTrace(PrintStream s) 和printStackTrace(PrintWriter s)。
*/
/*
printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因。
（这是白话解释，比较容易理解）
*/