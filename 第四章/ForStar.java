public class ForStar 
{
	public static void main(String[] args) 
	{
		int i,j,k; //ѭ������

		for (i=1;i<10 ;i++ ) //�ϰ벿�֣�i�������ϰ벿�ֵ�����
		{
			for (j=1;j<10-i ;j++ ) //j������ÿһ�е�ǰ���ո���
			{
				System.out.print(" ");
			}
			for (k=1;k<=2*i-1 ;k++ )
			{
				System.out.print("*");//k:����ÿһ�е�*��
			}
			System.out.println();
		}
		for (i=2;i<10 ;i++ )  //����°벿��
		{
			for (j=1;j<i ;j++ )
			{
				System.out.print(" ");
			}
			for (k=1;k<=19-2*i ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
