//抽象类需要用 abstract关键字修饰
public abstract class Shape{
	double l;
	//构造器
	public Shape(double l){
		this.l=l;
	}
	//未实现的方法用 abstract修饰 ----声明方法
	public abstract double getArea();
	public abstract double getPerimeter();
}