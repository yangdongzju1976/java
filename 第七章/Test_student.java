public class Test_student{
	public static void main(String[] args){
		//��̬���Ժͷ���ֱ��ͨ���������ã�����ʵ��������
		Student.name="����";
		System.out.println("����+��̬��������\t"+Student.name);
		System.out.println("����+��̬��������\t"+Student.getName());
		//��ͨ��������ͨ���Ա���ͨ��ʵ�������󣬱���ͨ���������
		Student stu=new Student();
		stu.age=20;
		System.out.println("������+��ͨ������:\t"+stu.age); //age
		System.out.println("������+��ͨ������:\t"+stu.getAge());
		stu.phoneNumber="13013988870";
		System.out.println("������+��ͨ������:\t"+stu.phoneNumber);	
		System.out.println("������+��ͨ������:\t"+stu.getPhoneNumber());
		
		//stu.address="������������";  ����������
	


	}
}