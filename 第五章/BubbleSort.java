import java.util.Random;
public class BubbleSort
{
	public static void main(String[] args) 
	{
		Random r=new Random();//�������
		int a[]=new int[30];  //��������a
		for (int i=0;i<a.length ;i++ )
			a[i]=r.nextInt(100);   //���������ķ����������������������и�ֵ
		System.out.println("����ǰ��");
		Output(a);  //�����������ǰ������
		Bubble(a); //����Bubble����������������a��������
		System.out.println("�����");
		Output(a);  //��������Ľ��
		
	}
	static void Bubble(int a[]){  //ð������ ����Ϊ����������������ĵ�ַ�����Դ��ظı��˵�ֵ
		int t;
		for (int i=0;i<a.length ;i++ ) //a.length��
			for (int j=0;j<a.length-i-1 ;j++ ) //˫��ѭ����ÿ�˲���һ����С������������ǰ�档
				if (a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];  //����a[j]��a[j+1],�ô�������ף�С����ð������
					a[j+1]=t;
				}
	}

	static void Output(int a[]){ //���������
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
	
}
//p87 ð������
