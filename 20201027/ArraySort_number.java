import java.util.Arrays;//排序
import java.util.Random;//java.util.Random类来产生一个随机数发生器，也是最常用的一种，构造函数有两个，Random()和Random(long seed)。第一个就是以当前时间为默认种子，第二个是以指定的种子值进行。
public class ArraySort_number
{	
	public static void main(String[] args) 
	{
	Random r=new Random();//以当前时间为默认种子 ,改变成固定种子，看结果Random(1)
	int a[]=new int[20];//定义一个数组。java的格式。
	int i,j,ran;
	
	for (i=0;i<a.length ;i++ )  //a.length:20 
		
		a[i]=r.nextInt(100); //100,随机数的范围。改变一下这个值，看结果。
		
	//Arrays.sort(a);全部排序
	//Java的Arrays类中有一个sort()方法，该方法是Arrays类的静态方法，在需要对数组进行排序时，非常的好用。
	System.out.println("\n排序前\n");
	Output(a);
	Arrays.sort(a,0,10);//只排序前10个。0~9
	System.out.println("\n排序后(只排前10个)\n");
	Output(a);

	System.out.println("\n\n\n\n");
	}
	static void Output(int a[]){
		for (int i=0;i<a.length ;i++ )
		{
		
			System.out.print("\t"+a[i]);//print :在同一行输出数组的一行。
			if (i!=0&i%10==0)
			{
				System.out.println();
			}
		}
		
	}
}

//p79拓展