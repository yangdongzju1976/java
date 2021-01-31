
import java.util.Scanner;
public class leap{
	public static void main(String args[]){
		int year;
		Scanner sc = new Scanner(System.in);
		try
		{			
		
			System.out.println("请输入年份：");
			year = sc.nextInt();
			if((year%4==0&&year%100!=0)||(year%400==0))
				System.out.print(year+"年是闰年。\n\n");
			else
				System.out.print(year+"年是平年。\n\n");
				System.out.println("以下年份是闰年");
			for (int i=1,t=0;i<2020 ;i++ )
			{
				if ((i%4==0&&i%100!=0)||(i%400==0))
				{
					System.out.printf("%6d",i);
					t++;
				}
				if (t%10==0&&((i%4==0&&i%100!=0)||(i%400==0)))
					{
						System.out.println();
					}
			}
		}
		catch (Exception e)
		{
			System.out.print(e.getMessage());
		}
		 Runtime runtime=Runtime.getRuntime();

        try{

        runtime.exec("color 70");

        }catch(Exception e){

        System.out.println("Error!");

        }

}
}