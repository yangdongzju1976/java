import java.util.*;// java.util.Date 类和 java.util.Calendar 类
import java.text.*; //
public class Calendar_
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		//System.out.println(
		System.out.println("Date:"+cal.get(Calendar.DATE));//-----------------------当天 1-31
		System.out.println("Day of month:"+cal.get(Calendar.DAY_OF_MONTH));//---------------当天 1-31
		System.out.println("Day of Week:"+cal.get(Calendar.DAY_OF_WEEK));//----------------从星期天开始计算，如果今天星期二，那么返回3
		System.out.println("Day of Year"+cal.get(Calendar.DAY_OF_YEAR));//----------------
		cal.get(Calendar.HOUR);//-----------------------12小时制
		cal.get(Calendar.HOUR_OF_DAY);//----------------24小时制，一般使用这个属性赋值
		cal.get(Calendar.MILLISECOND);//----------------
		cal.get(Calendar.MINUTE);//---------------------
		cal.get(Calendar.SECOND);//---------------------
		cal.get(Calendar.WEEK_OF_MONTH);//--------------
		cal.get(Calendar.WEEK_OF_YEAR);//---------------
		cal.get(Calendar.MONTH);//-----------------------月份获取需要 +1，那么，赋值时需要 -1


	}
}
