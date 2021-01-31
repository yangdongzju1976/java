public class TypeConversion
{
	public static void main(String[] args) 
	{
		short a=111;
		long  b=1256;
		int   c=78;
		byte  d=10;
		char  e='A';
		float f=123.45f;//浮点型
	   double g=999.45e5; //双精度
	   System.out.println("\n\t\t\t自动类型转换\n");
		System.out.println("short 类型 a="+a+"\tlong 类型 b="+b+"\tint 类型 c="+c);
		System.out.println("byte  类型 d="+d+"\t\tchar 类型 e="+e+"\tfloat 类型 f="+f+"\tdouble 类型 g="+g);
		System.out.println("a+b="+(a+b));//System.out.println("a+b="+a+b);分别输出a和b.
		System.out.println("a+c="+(a+c)); //System.out.println("="+());
		System.out.println("d+c="+(d+c));
		System.out.println("a+e="+(a+e));
		System.out.println("d+f="+(d+f));
		System.out.println("e+g="+(e+g));
		




	}
}
//p57,第57页