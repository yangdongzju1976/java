public class MorningGreetings

{
	public static void main(String[] args) 
	{
		MorningGreetings mg=new MorningGreetings();
		int day1=1,day2=5,day3=6,day4=7,day5=9;
		
		mg.greetings(day1);
		mg.greetings(day2);
		mg.greetings(day3);
		mg.greetings(day4);
		mg.greetings(day5);
	}
	public void greetings(int n){
		int m;
		switch (n)
		{
		case 1:{
			m=n+5;
			System.out.println("星期一，限行尾号为： "+n+" , "+m);
			break;
		}
		case 2:{m=n+5;
			System.out.println("星期二，限行尾号为： "+n+" , "+m);
			break;}
		case 3:{m=n+5;
			System.out.println("星期三，限行尾号为： "+n+" , "+m);
			break;}
		case 4:{m=n+5;
			System.out.println("星期四，限行尾号为： "+n+" , "+m);
			break;}
		case 5:{m=n-5;
			System.out.println("星期五，限行尾号为： "+n+" , "+m);
			break;}
		case 6:
		case 7:{
			System.out.println("周末不限行");
			break;
		}
		default:{
			System.out.println("输入错误");
		}
		}
	}
}
//p64 switch语句。
