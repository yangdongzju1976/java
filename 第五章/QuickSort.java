import java.util.Random;
public class QuickSort
{
	static int a[]=new int[30]; 
	public static void main(String[] args) 
	{
		Random r=new Random();//�������
		 //��������a
		for (int i=0;i<a.length ;i++ )
			a[i]=r.nextInt(100);   //���������ķ����������������������и�ֵ
		System.out.println("����ǰ��");
		Output(a);  //�����������ǰ������
		//Bubble(a); //����Bubble����������������a��������
		System.out.println(a[0]+"\t"+a[a.length-1]);
		quickSort(a,0,a.length-1);
		System.out.println("�����");
		Output(a);  //��������Ľ��
		
		
	}
	

	private static void Output(int a[]){ //���������
		int t=1;
		for (int i=0;i<a.length ;i++ ,t++)
		{
		
			System.out.print(a[i]+"\t");//print :��ͬһ����������һ�С�
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
			int i,j,temp;//i:��ָ�룬j:��ָ�롣temp:��ŵ���֮ǰ��a[left]ֵ
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
	
	private static void Swap(int a[],int i,int j){ //����a[i]��a[j]��ֵ
		int t;
		t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
}
//p87 ð������
