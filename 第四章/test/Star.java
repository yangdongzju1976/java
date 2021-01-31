public class Star
{
	public static void main(String[] args) 
	{
		int i,j;
		for (i=0;i<9 ;i++ ){ //输出上半部分，i控制行数
			for (j=0;j<2*i+1 ;j++ ) //j控制每一行的*数。这个数与i有关。
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (i=0;i<8 ;i++ ){ //输出下半部分，i控制行数
			for (j=0;j<15-2*i ;j++ ) //j控制每一行的*数。这个数与i有关。
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
