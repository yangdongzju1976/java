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
			System.out.println("����һ������β��Ϊ�� "+n+" , "+m);
			break;
		}
		case 2:{m=n+5;
			System.out.println("���ڶ�������β��Ϊ�� "+n+" , "+m);
			break;}
		case 3:{m=n+5;
			System.out.println("������������β��Ϊ�� "+n+" , "+m);
			break;}
		case 4:{m=n+5;
			System.out.println("�����ģ�����β��Ϊ�� "+n+" , "+m);
			break;}
		case 5:{m=n-5;
			System.out.println("�����壬����β��Ϊ�� "+n+" , "+m);
			break;}
		case 6:
		case 7:{
			System.out.println("��ĩ������");
			break;
		}
		default:{
			System.out.println("�������");
		}
		}
	}
}
//p64 switch��䡣
