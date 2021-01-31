import java.util.*;// java.util.Date 类和 java.util.Calendar 类
import java.text.*; //
public class Date_
{
	public static void main(String[] args) 
	{
		Date date=new Date();
		//1.输出当前时间
		System.out.println("date="+date);//输出当前时间
		System.out.println("date="+date.getTime());//1970年以来的毫秒数
		//2.传入一个long型数值,表示在时间原点之后
		Date d2 = new Date(23244000);   //传入一个long型数值,表示在时间原点之后
        System.out.println("d2="+d2);
		//3.定义日期格式，其中y、M、d、h、m、s等都代表固定的含义
		DateFormat d3 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");   //定义日期格式，其中y、M、d、h、m、s等都代表固定的含义，可以参考API文档
		String str = d3.format(new Date());
		System.out.println("新格式："+str);
		SimpleDateFormat f = new SimpleDateFormat("大家好，今天是 " + "yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒");
        System.out.println(f.format(date)); // 将当前时间袼式化为指定的格式


	}
}
