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
		return Math.PI*wr*wr-Math.PI*nr*nr;
	}
	double getPerimeter()
	{
		return 2*Math.PI*nr+2*Math.PI*wr;
	}
	void show()
	{
		System.out.println("�����"+getArea());
		System.out.println("���ȣ�"+getPerimeter());

	}
	public static void main(String[] args) 
	{
		Ring r=new Ring(1,14);
		r.show();
	}
}