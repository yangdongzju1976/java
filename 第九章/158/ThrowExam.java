import java.io.*;
public class ThrowExam
{
	//表示的是本方法不处理异常，交给被调用处处理
	//而且被调用处必须处理。
	//虚拟机处理，整个程序会中断！ 如果在程序中捕获  还可以继续进行。
	public void readFile() throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("c:/a.txt");
		int b;
		b=fis.read();
		while(b!=-1)
		{
			System.out.println((char)b);
			b=fis.read();
		}
		fis.close();
		
	}
	public static void main(String[] args) 
	{
		ThrowExam t=new ThrowExam();
		try
		{
			t.readFile();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("文件找不到"+e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("文件打不开"+e.getMessage());
		}
		//System.out.println("Hello World!");
	}
}
