//���ʿն���������쳣
import java.util.*;
public class ExceptionExam2
{
	public static void main(String[] args) 
	{
		Date d=null;
	    System.out.println(d.getTime());

	}
}
/*
�������쳣��
Exception in thread "main" java.lang.NullPointerException
        at ExceptionExam2.main(ExceptionExam2.java:8)

	�е��쳣����ͨ���������������
	if(d==null)
	{}
	else
	{}
	����һЩ�쳣�޷�ͨ�������ͨ������Ŀ��������⡣
	�磺�û�����URL��ַ�����ж��Ƿ�����������ӡ�
*/