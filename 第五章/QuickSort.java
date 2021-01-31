import java.util.Random;
public class QuickSort
{
	static int a[]=new int[30]; 
	public static void main(String[] args) 
	{
		Random r=new Random();//随机对象
		 //定义数组a
		for (int i=0;i<a.length ;i++ )
			a[i]=r.nextInt(100);   //用随机对象的方法产生的随机数对数组进行赋值
		System.out.println("排序前：");
		Output(a);  //输出排序排序前的数组
		//Bubble(a); //调用Bubble（）方法，对数组a进行排序
		System.out.println(a[0]+"\t"+a[a.length-1]);
		quickSort(a,0,a.length-1);
		System.out.println("排序后：");
		Output(a);  //输出排序后的结果
		
		
	}
	

	private static void Output(int a[]){ //输出函数。
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
	private static void quickSort(int a[],int left,int right){
		if (left<right)
		{
			int i,j,temp;//i:左指针，j:右指针。temp:存放调用之前的a[left]值
			i=left;
			j=right;
			temp=a[i];
			System.out.println("\n"+a[i]);
			while(i!=j){
				while (i<j&a[j]>=temp)
					j--;
			}
				/*Swap(a,i,j);
				while (i<j&a[i]<=temp)
					i--;
				Swap(a,i,j);
		
			}
			*/
			//quickSort(a,i+1,right);
		//	quickSort(a,left,i-1);
		}
		  
	}
	
	private static void Swap(int a[],int i,int j){ //交换a[i]与a[j]的值
		int t;
		t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
}
//p87 冒泡排序
