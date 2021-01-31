//访问空对象引起的异常
import java.util.*;
public class ExceptionExam2
{
	public static void main(String[] args) 
	{
		Date d=null;
	    System.out.println(d.getTime());

	}
}
/*
产生的异常：
Exception in thread "main" java.lang.NullPointerException
        at ExceptionExam2.main(ExceptionExam2.java:8)

	有的异常可以通过程序控制来避免
	if(d==null)
	{}
	else
	{}
	但有一些异常无法通过或很难通过程序的控制来避免。
	如：用户输入URL地址进行判断是否进行网络连接。
*/