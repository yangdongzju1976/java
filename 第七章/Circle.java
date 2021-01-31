public class Circle extends Shape{
	public Circle(double l){
		super(l);
	}
	//子类继承父类后，实现父类定义的所有抽象方法。实现其具体功能
	public double getArea(){
		//计算圆的面积
		return Math.PI*l*l;
	}
	public double getPerimeter(){
		//计算圆的周长
		return 2*Math.PI*l;
	}
	public static void main(String[] args){
		//生成对象
		Circle c=new Circle(12.7);
		
		System.out.printf("圆的面积为：%8.3f\n",c.getArea());
		System.out.printf("圆的周长为：%8.3f\n",c.getPerimeter());
	}
}
