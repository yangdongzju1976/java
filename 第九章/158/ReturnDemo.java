import java.io.*;
public class ReturnDemo
{
	public static void main(String[] args) 
	{
		int t;
		ReturnDemo d=new ReturnDemo();
		t=d.getInt();
		System.out.println("t="+t);
	}
	public int getInt()
	{
		try
		{
			return 1;
		}
		catch (Exception e)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
		
	}
}
