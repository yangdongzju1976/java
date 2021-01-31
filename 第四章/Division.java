//p51 除法运算
public  class Division 
{
	public static void main(String agrs[]) 
	{	
		//除法运算
		System.out.println("\t除法运算");
		System.out.println("123.0/0="+123.0/0);
		//System.out.println("123/0="+123/0);
		//取模运算 对于java来说，其操作数可以是浮点数，计算结果也就是浮点数。
		System.out.println("\t取模运算");
		System.out.println("123.5 mod 4="+123.5%4);
		System.out.println("123 mod 4="+123%4);
		//二元运算符简捷赋值方式
		int a=5,b;
		System.out.println("\t二元运算符的简捷赋值运算\n\ta="+a);
		a+=5;//相当于 a=a+5
		System.out.println("a+=5   a="+a);
		a-=5;//相当于 a=a-5;
		System.out.println("a-=5   a="+a);
		a*=5;//相当于 a=a*5
		System.out.println("a*=5   a="+a);
		a/=5;//相当于 a=a/5
		System.out.println("a/=5   a="+a);
		a%=5;//相当于 a=a%5 取余运算
		System.out.println("a%=5   a="+a);
		//关系运算符
		System.out.println("关系运算");
		System.out.print("4<5\t");
		System.out.println(4<5);
		System.out.print("4>5\t");
		System.out.println(4>5);
		System.out.print("4==5\t");
		System.out.println(4==5);
		System.out.print("4!=5\t");
		System.out.println(4!=5);
		//逻辑运算符
		System.out.println("\t逻辑运算");
		System.out.print("或运算4<5|4>5\t\t");
		System.out.println(4<5|4>5);
		System.out.print("与运算4<5&4>5\t\t");
		System.out.println(4<5&4>5);
		System.out.print("非运算!true\t\t");
		System.out.println(!true);
		System.out.print("非运算!flase\t\t");
		System.out.println(!false);
		System.out.print("异或运算4<5^4>2\t\t");
		System.out.println(4<5^4>2);
		System.out.print("异或运算4<5^4>5\t\t");
		System.out.println(4<5^4>5);
		System.out.println("\t三元运算符");
		int m=10,n=20,t;
		t=m>n?m:n;
		//System.out.println("m="+m+"n="+n+"m>n?m:n的值为:"+m>n?m:n);
		System.out.println("m="+m+"\tn="+n+"\tm>n?m:n的值为:"+t);
		System.out.println("\t递增/递减运算符：");
		a=10;
		b=10;
		System.out.println("运算前：a="+a+"\tb="+b);
		m=2*++a;
		n=2*b++;
		System.out.println("2*++a的值为："+m);
		System.out.println("2*b++的值为："+n);
		System.out.println("运算后：a="+a+"\tb="+b);

	
	}

}
