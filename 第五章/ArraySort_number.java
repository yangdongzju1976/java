import java.util.Arrays;//����
import java.util.Random;//java.util.Random��������һ���������������Ҳ����õ�һ�֣����캯����������Random()��Random(long seed)����һ�������Ե�ǰʱ��ΪĬ�����ӣ��ڶ�������ָ��������ֵ���С�
public class ArraySort_number
{	
	public static void main(String[] args) 
	{
	Random r=new Random();//�Ե�ǰʱ��ΪĬ������ ,�ı�ɹ̶����ӣ������Random(1)
	int a[]=new int[20];//����һ�����顣java�ĸ�ʽ��
	int i,j,ran;
	
	for (i=0;i<a.length ;i++ )  //a.length:20 
		
		a[i]=r.nextInt(100); //100,������ķ�Χ���ı�һ�����ֵ���������
		
	//Arrays.sort(a);ȫ������
	//Java��Arrays������һ��sort()�������÷�����Arrays��ľ�̬����������Ҫ�������������ʱ���ǳ��ĺ��á�
	System.out.println("\n����ǰ\n");
	Output(a);
	Arrays.sort(a,0,10);//ֻ����ǰ10����0~9
	System.out.println("\n�����(ֻ��ǰ10��)\n");
	Output(a);

	System.out.println("\n\n\n\n");
	}
	static void Output(int a[]){
		for (int i=0;i<a.length ;i++ )
		{
		
			System.out.print("\t"+a[i]);//print :��ͬһ����������һ�С�
			if (i!=0&i%10==0)
			{
				System.out.println();
			}
		}
		
	}
}

//p79��չ