public class Star
{
	public static void main(String[] args) 
	{
		int i,j;
		for (i=0;i<9 ;i++ ){ //����ϰ벿�֣�i��������
			for (j=0;j<2*i+1 ;j++ ) //j����ÿһ�е�*�����������i�йء�
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (i=0;i<8 ;i++ ){ //����°벿�֣�i��������
			for (j=0;j<15-2*i ;j++ ) //j����ÿһ�е�*�����������i�йء�
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
