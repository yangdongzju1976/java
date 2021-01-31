import java.util.Random;
public class NumberBackup
{
	public static void main(String[] args) 
	{
		int[] a=new int[20];
		int b[];
		b=a;
		Random r=new Random();
		for (int i=0;i<a.length ;i++ )  //a.length:10 行数
			a[i]=r.nextInt(100); //100,随机数的范围。改变一下这个值，看结果。
		
		System.out.println("\n输出数组a:\n");
		Output(a);
		System.out.println("\n\n输出数组b:\n");
		Output(b);
		b[0]=100;
		System.out.println("\n\n修改数组b,让b[0]等于100");
		System.out.println("\n再输出数组a:\n");
		Output(a);
		System.out.println("\n\n再输出数组b:\n");
		Output(b);

		System.out.println("\n\n\n");
	}
	static void Output(int a[]){  //输出函数
		int j=1;
		for (int i=0;i<a.length ;i++ ,j++)
		{
		
			System.out.print("\t"+a[i]);//print :在同一行输出数组的一行。
			if (j%10==0)
			{
				System.out.println();
			}
		}
		
	}
}
