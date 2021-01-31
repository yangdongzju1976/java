public class Star
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=1;i<=4 ;i++ )
		{
			for (k=0;k<4-i ; k++)
			{
				System.out.print(" ");
			}
			for (j=1;j<=4 ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
