import java.io.*;
 class SelfDefinedException extends Exception
{
	public SelfDefinedException()
	{
		super("�Զ����������");
	}
}
public class TestPrintStackTrace 
{
	public static void main(String[] args) 
	{
		try
		{
			firstMethod();
		}
		catch (SelfDefinedException e)
		{
			e.printStackTrace();
		}
	}

	public static void firstMethod() throws SelfDefinedException{
		secondMethod();
	}
	public static void secondMethod() throws SelfDefinedException{
		thirdMethod();
	}
	public static void thirdMethod() throws SelfDefinedException{
		throw new SelfDefinedException();
	}
}
/*
e.printStackTrace();�Ǵ�ӡ�쳣�Ķ�ջ��Ϣ��ָ������ԭ��
�������쳣ʱ��ͨ��Ҫ�����쳣�����Ǳ�̵ĺ�ϰ�ߣ�
����e.printStackTrace()���Է�������Գ���

e��Throwable��ʵ���쳣��������catch����У��൱��һ���βΣ�
һ��try�������쳣����ô�ͽ�����쳣��Ϣ����e����e����
printStackTrace()���쳣���һ���������������صķ�������printStackTrace(PrintStream s) ��printStackTrace(PrintWriter s)��
*/
/*
printStackTrace()��������˼�ǣ��������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��
�����ǰ׻����ͣ��Ƚ�������⣩
*/