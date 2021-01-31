public class Test_student{
	public static void main(String[] args){
		//静态属性和方法直接通过类名调用，不用实例化对象
		Student.name="张三";
		System.out.println("类名+静态属性名：\t"+Student.name);
		System.out.println("类名+静态方法名：\t"+Student.getName());
		//普通方法和普通属性必须通过实例化对象，必须通过对象访问
		Student stu=new Student();
		stu.age=20;
		System.out.println("对象名+普通属性名:\t"+stu.age); //age
		System.out.println("对象名+普通方法名:\t"+stu.getAge());
		stu.phoneNumber="13013988870";
		System.out.println("对象名+普通属性名:\t"+stu.phoneNumber);	
		System.out.println("对象名+普通属性名:\t"+stu.getPhoneNumber());
		
		//stu.address="徐州市云龙区";  ？错在哪里
	


	}
}