import java.io.*;
public class ThrowExam
{
	//��ʾ���Ǳ������������쳣�����������ô�����
	//���ұ����ô����봦��
	//�������������������жϣ� ����ڳ����в���  �����Լ������С�
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
			System.out.println("�ļ��Ҳ���"+e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("�ļ��򲻿�"+e.getMessage());
		}
		//System.out.println("Hello World!");
	}
}
