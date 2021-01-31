import java.io.*;
public class ErrorDemo
{
	
	public static void main(String[] args) throws FileNotFoundException {
		try
		{
			long[] arr = new long[1024*1024*100*4];//内存不足的错误
		}
		catch (Exception e)
		{
			System.out.println("文件找不到2"+e.getMessage());
		}
        
    }
}


