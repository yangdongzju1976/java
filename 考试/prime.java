import java.lang.Math
class prime 
{
	public static void main(String[] args) 
	{
		int i,j,t,a[40];
	t=0;
	for (i=2;i<100 ;i++ )
	{
		for (j=2;j<Math.sqrt(i) ;j++ )
		{
			if (i%j==0)
			{
				break;
			}
		}
		if (j>sqrt(i))
		{
			a[t++]=i;
		}
	}
	
	for (i=0;i<t ;i++ )
	{
		System.out.printf("%d\t",a[i]);
		if ((i+1)%10==0)
		{
			printf("\n");
		}
	}
	
	return 0;
	}
}
