public class ForStar 
{
	public static void main(String[] args) 
	{
		int i,j,k; //循环变量

		for (i=1;i<10 ;i++ ) //上半部分，i：控制上半部分的行数
		{
			for (j=1;j<10-i ;j++ ) //j：控制每一行的前导空格数
			{
				System.out.print(" ");
			}
			for (k=1;k<=2*i-1 ;k++ )
			{
				System.out.print("*");//k:控制每一行的*数
			}
			System.out.println();
		}
		for (i=2;i<10 ;i++ )  //输出下半部分
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
