import java.util.*;
import java.lang.*;
public class ExecptionDemo1  
{
	public static void main(String[] args) 
	{
		double f;
		Scanner input=new Scanner(System.in);
		System.out.println("����f��ֵ��");
		f = input.nextDouble();
		f=Math.sqrt(-12.5);
		System.out.println("sqrt(f)="+f);
		System.out.println("1/0="+1/0);
	}
}
/*
Java������ڴ�����������ʱ�������׳��κ�����ʱ�쳣��
����һ�������������ʱ������ʹ���з��ŵ����������ʾ��
���ĳ���������û����ȷ����ѧ����Ļ�������ʹ��NaNֵ����ʾ��
����ʹ��NaNֵ��Ϊ���������������������������NaN��
*/
