public class currentTimeMillisDemo{
	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		int sum=0,temp;
		for (int i=0;i<10000 ;i++ )
		{
			System.out.print(" "+i);
			temp=i*i;
			sum+=i;
		}
		long end=System.currentTimeMillis();
		System.out.println("\n\n");
		System.out.printf("start:%d\tend:%d\nend-start=%d\n\n\n",start,end,end-start);
	}
}
