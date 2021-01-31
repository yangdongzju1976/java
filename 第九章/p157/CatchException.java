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
		catch (FileNotFoundException e1) //�Ҳ����ļ��������쳣
		{
			System.out.println("�ļ��Ҳ���1"+e1.getMessage());
			System.out.println("\ne1="+e1);
			e1.printStackTrace();
			
		}
		catch (IOException e2) //���� I/O ����ʱ�������쳣��
		{
			System.out.println("�ļ��Ҳ���2"+e2.getMessage());
		}
		finally
		{
			try
			{
				if (fis!=null)
				{
					System.out.printf("\n��������ر��ļ�\n");
					fis.close();
				}
				else
				{
					System.out.printf("\n�ļ���ʧ��\n");
				}
			}
			catch (IOException ioe)
			{
				System.out.println("1");
				System.out.println("�ر��ļ�����");
			}
		}
	}
}
/*
��try����г����쳣��ʱ����ִ��catch �е���䣬java����ʱϵͳ���Զ���
catch�����е�Exception e ��ʼ����Ҳ����ʵ����Exception���͵Ķ���
e�Ǵ˶����쳣���ơ�Ȼ��e�����ã����Զ�����Exception����ָ���ķ���
*/