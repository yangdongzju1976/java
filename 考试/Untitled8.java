import java.lang.Math.*;
public class Ring 
{
	private double nr;
	private double wr;
	private String tcolor;
	Ring()
	{}
	Ring(double r1,double r2)
	{
		nr=r1;
		wr=r2;
	}
	double getArea()
	{
		return Math.PI*wr*wr-Math.PI*r1*r1;
	}
	double getPerimeter()
	{
		return 2*Math.PI*nr+2*Math.PI*wr;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
