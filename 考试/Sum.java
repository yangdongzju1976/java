class Sum 
{
	public static void main(String[] args) 
	{
		int i,sum=0,temp=1;
		for (i=1;i<=10 ;i++ )
		{
			temp*=i;
			sum+=temp;
		}
		System.out.println("1!+2!+..10!="+sum);
	
	}
}
