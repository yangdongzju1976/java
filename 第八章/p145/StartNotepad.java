//import java.io.*;
import java.io.*;
import java.lang.*;
public class StartNotepad
{
	public static void main(String[] args) throws IOException
	{
		//��ȡRuntime����
		Runtime run=Runtime.getRuntime();
		
		//Runtime.getRuntime().exec("C:\\Windows\\notepad.exe c:\\a.txt");//��һ��ʽ�������ɶ���ֱ��ͨ�������
		//run.exec("C:\\Windows\\System32\\calc.exe");
		//run.exec("C:\\Windows\\System32\\cmd  dir ");
		//�ڶ��ַ�ʽ�����ɶ���
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


//Ӧ�ó�����ֱ�Ӷ�Runtime�����ʵ������������ͨ��getRuntime()������ȡ���
//���������Runtime�����������ʹ����˵�ǰ���г��������ʱ������ͨ���ö���
//���Է���JVM�������Ϣ���紦�����������ڴ���Ϣ�ȡ�

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
