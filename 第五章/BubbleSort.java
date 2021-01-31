import java.util.Random;
public class BubbleSort
{
	public static void main(String[] args) 
	{
		Random r=new Random();//随机对象
		int a[]=new int[30];  //定义数组a
		for (int i=0;i<a.length ;i++ )
			a[i]=r.nextInt(100);   //用随机对象的方法产生的随机数对数组进行赋值
		System.out.println("排序前：");
		Output(a);  //输出排序排序前的数组
		Bubble(a); //调用Bubble（）方法，对数组a进行排序
		System.out.println("排序后：");
		Output(a);  //输出排序后的结果
		
	}
	static void Bubble(int a[]){  //冒泡排序 参数为数组名，代表数组的地址，可以带回改变了的值
		int t;
		for (int i=0;i<a.length ;i++ ) //a.length趟
			for (int j=0;j<a.length-i-1 ;j++ ) //双重循环，每趟产生一个最小的数，放在最前面。
				if (a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];  //交换a[j]与a[j+1],让大的数沉底，小的数冒上来。
					a[j+1]=t;
				}
	}

	static void Output(int a[]){ //输出函数。
		int t=1;
		for (int i=0;i<a.length ;i++ ,t++)
		{
		
			System.out.print(a[i]+"\t");//print :在同一行输出数组的一行。
			if (t%10==0)
			{
				System.out.println();
			}
		}
		System.out.println();

	}
	
}
//p87 冒泡排序
