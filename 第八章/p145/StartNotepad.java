//import java.io.*;
import java.io.*;
import java.lang.*;
public class StartNotepad
{
	public static void main(String[] args) throws IOException
	{
		//获取Runtime对象。
		Runtime run=Runtime.getRuntime();
		
		//Runtime.getRuntime().exec("C:\\Windows\\notepad.exe c:\\a.txt");//第一方式，不生成对象，直接通过类调用
		//run.exec("C:\\Windows\\System32\\calc.exe");
		//run.exec("C:\\Windows\\System32\\cmd  dir ");
		//第二种方式，生成对象。
		//run.exec("C:\\Windows\\notepad.exe c:\\a.txt");
		//run.exec("C:\\Windows\\System32\\cmd.exe ");
		//Runtime.getRuntime().exec("CMD");
		//Runtime.getRuntime().exec("D:\\Program Files (x86)\\CTerm\\CTerm.exe");
		try
		{
			String command = "cmd /c dir";
	     Process process = Runtime.getRuntime().exec(command);
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	while((output=bufferedReader.readLine()) != null){
			System.out.println(output);
	}


		}
		catch (Exection e)
		{
			;
		}
	}
}
//rt.exec("cmd /c set CLASSPATH=D:\\ && javac D:\\a.java && java a");


//应用程序不能直接对Runtime类进行实例化，但可以通过getRuntime()方法获取与该
//程序关联的Runtime对象。这个对象就代表了当前运行程序的运行时环境。通过该对象
//可以访问JVM的相关信息，如处理器数量，内存信息等。

/*
                       .::::.
                     .::::::::.
                    :::::::::::  
                ..:::::::::::'
              '::::::::::::'
                .::::::::::
           '::::::::::::::..
                ..::::::::::::.
              ``::::::::::::::::
               ::::``:::::::::'        .:::.
              ::::'   ':::::'       .::::::::.
            .::::'      ::::     .:::::::'::::.
           .:::'       :::::  .:::::::::' ':::::.
          .::'        :::::.:::::::::'      ':::::.
         .::'         ::::::::::::::'         ``::::.
     ...:::           ::::::::::::'              ``::.
    ```` ':.          ':::::::::'                  ::::..
                       '.:::::'                    ':'````..
*/
