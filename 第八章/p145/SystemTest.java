import java.io.IOException;
public class	SystemTest  
{
	public static void main(String[] args) 
	{
		System.out.println("请输入字符，按回车键结束输入:");
		 int c;
		 try {
		  c = System.in.read();    // 读取输入的字符
            while(c != '\r') {    // 判断输入的字符是不是回车
                System.out.println( c);    // 输出字符
                c = System.in.read();
			}
		 }
			catch(IOException e) {
            System.out.println(e.toString());
        } finally {
            System.err.println();
        }
	}
}


/*
System 类有 3 个静态成员变量，分别是 PrintStream out、InputStream in 和 PrintStream err.
		PrintStream类:将基本数据类型的数据格式化成字符串输出。
		PrintStream out:标准输出流。此流已打开并准备接收输出数据。通常，此流对应于显示器输出或者由主机环境或用户指定的另一个输出目标。
		InputStream in:标准输入流。此流已打开并准备提供输入数据。通常，此流对应于键盘输入或者由主机环境或用户指定的另一个输入源。
*/
