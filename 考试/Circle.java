import java.lang.Math.*;
public class Circle
{
	private double Radius;
	Circle()
	{}
	Circle(double r)
	{
		Radius=r;		
	}
	double getArea()
	{
		return Math.PI*Radius*Radius;
	}
	double getPerimeter()
	{
		return 2*Math.PI*Radius;
	}
	void show()
	{
		System.out.println("���="+getArea());
		System.out.println("�ܳ�="+getPerimeter());
	}
	public static void  main(String[] args)
	{
		Circle A=new Circle(3.5);
		A.show();

	}
}
