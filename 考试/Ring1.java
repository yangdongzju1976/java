import java.lang.Math.*;
public class Ring1
{
	private double nr;
	private double wr;
	private String tcolor;
	Ring1()
	{}
	Ring1(double r1,double r2)
	{
		nr=r1;
		wr=r2;
	}
	double getArea()
	{
		return Math.PI*wr*wr-Math.PI*nr*nr;
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