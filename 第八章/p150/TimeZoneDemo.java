import java.util.*;
public class TimeZoneDemo
{
	public static void main(String[] args) 
	{
		int i=0;
		//支持的所有时区ID
		String[] ids = TimeZone.getAvailableIDs();
		for (String id:ids)
		{ 
			 i++;
		// System.out.printf(id+", ");
		 if (i%3==0)
		 {
		//	 System.out.printf("\n");
		 }
		
		}
		//获取默认的时区
		TimeZone zone01=TimeZone.getDefault();
		//输出默认时区的ID
		System.out.println("时区ID: "+zone01.getID());
		//输出默认时区的名称
		System.out.println("时区名称: "+zone01.getDisplayName());
		//更改系统时区
		zone01.setID("VST");
		//输出修改后的时区的名称
		System.out.println("修改后的时区名称: "+zone01.getDisplayName());

	}
}
