import java.util.*;// java.util.Date ��� java.util.Calendar ��
import java.text.*; //
public class Calendar_
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		//System.out.println(
		System.out.println("Date:"+cal.get(Calendar.DATE));//-----------------------���� 1-31
		System.out.println("Day of month:"+cal.get(Calendar.DAY_OF_MONTH));//---------------���� 1-31
		System.out.println("Day of Week:"+cal.get(Calendar.DAY_OF_WEEK));//----------------�������쿪ʼ���㣬����������ڶ�����ô����3
		System.out.println("Day of Year"+cal.get(Calendar.DAY_OF_YEAR));//----------------
		cal.get(Calendar.HOUR);//-----------------------12Сʱ��
		cal.get(Calendar.HOUR_OF_DAY);//----------------24Сʱ�ƣ�һ��ʹ��������Ը�ֵ
		cal.get(Calendar.MILLISECOND);//----------------
		cal.get(Calendar.MINUTE);//---------------------
		cal.get(Calendar.SECOND);//---------------------
		cal.get(Calendar.WEEK_OF_MONTH);//--------------
		cal.get(Calendar.WEEK_OF_YEAR);//---------------
		cal.get(Calendar.MONTH);//-----------------------�·ݻ�ȡ��Ҫ +1����ô����ֵʱ��Ҫ -1


	}
}
