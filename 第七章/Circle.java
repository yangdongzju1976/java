public class Circle extends Shape{
	public Circle(double l){
		super(l);
	}
	//����̳и����ʵ�ָ��ඨ������г��󷽷���ʵ������幦��
	public double getArea(){
		//����Բ�����
		return Math.PI*l*l;
	}
	public double getPerimeter(){
		//����Բ���ܳ�
		return 2*Math.PI*l;
	}
	public static void main(String[] args){
		//���ɶ���
		Circle c=new Circle(12.7);
		
		System.out.printf("Բ�����Ϊ��%8.3f\n",c.getArea());
		System.out.printf("Բ���ܳ�Ϊ��%8.3f\n",c.getPerimeter());
	}
}
