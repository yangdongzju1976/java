//数学计算引起的异常
public class ExceptionExam
{
	public static void main(String[] args) 
	{
		int a,b;
		double c;
		a=Integer.parseInt(args[0]);
	    b=Integer.parseInt(args[1]);
		c=a/b;
		//System.out.println("hello"+a);
	    System.out.println(a+"/"+b+"="+c);
		System.out.println(a+"/"+b+"="+1/0);

	}
}
// java ExceptionExam 1 0