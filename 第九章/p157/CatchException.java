import java.io.*;
public class CatchException  
{
	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		try
		{
			 fis=new FileInputStream("d:/a.txt");
			int b;
			b=fis.read();
			while (b!=-1)
			{
				System.out.print((char)b);
				b=fis.read();
			}
			
		}
		catch (FileNotFoundException e1) //找不到文件引发的异常
		{
			System.out.println("文件找不到1"+e1.getMessage());
			System.out.println("\ne1="+e1);
			e1.printStackTrace();
			
		}
		catch (IOException e2) //发生 I/O 错误时引发的异常。
		{
			System.out.println("文件找不到2"+e2.getMessage());
		}
		finally
		{
			try
			{
				if (fis!=null)
				{
					System.out.printf("\n任务结束关闭文件\n");
					fis.close();
				}
				else
				{
					System.out.printf("\n文件打开失败\n");
				}
			}
			catch (IOException ioe)
			{
				System.out.println("1");
				System.out.println("关闭文件出错！");
			}
		}
	}
}
/*
当try语句中出现异常是时，会执行catch 中的语句，java运行时系统会自动将
catch括号中的Exception e 初始化，也就是实例化Exception类型的对象。
e是此对象异常名称。然后e（引用）会自动调用Exception类中指定的方法
*/