 public class  Battery
 
{
	public static void main(String[] args) 
	{
		int a=40,b=20,c=6,d=5;
		Battery bat=new Battery();
		System.out.println("\t��powerΪ40ʱ��");
		bat.warning(a);
		System.out.println("\t��powerΪ20ʱ��");
		bat.warning(b);
		System.out.println("\t��powerΪ6ʱ��");
		bat.warning(c);
		System.out.println("\t��powerΪ5ʱ��");
		bat.warning(d);
	}
	public void warning(int power){
		if (power<=5)
		{
			System.out.println("*The power runs out,about to shutdown*");
		} else if (power<=10) // 5<power<=10
		{
			System.out.println("*Replace the battery*");
		}else if (power<30) //10<power<=30
		{
			System.out.println("*The power is lower*");
		} else  //power >=30
			System.out.println("*The power is enough*");
		}

}
//p83 if���
