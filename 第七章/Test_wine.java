/*
һ��java�ļ��п��Զ������࣬�������ֻ��һ���౻public���Σ������������������ļ���������ͬ��
������ļ���û��public���࣬���ļ��������һ��������ּ��ɡ���Ҫע����ǣ�����javacָ�����
�ж�����Java�ļ�ʱ�������ÿһ��������һ����Ӧ��.class �ļ���
*/
public class  Test_wine{ //����
	public static void main(String[] args) 
	{
		Wine a=new JNC(); //�����������á�
		a.fun1();  //��ͬ�ĵ��ã���ͬ����������Ӧ�������Ǹ����ж���ķ���
		a.fun4(); //a.fun2("");
		//a.fun3();//�����޴˷������������
		JNC b=new JNC();
		b.fun2(" ");
		b.fun3();
		System.out.println("\n\n"+a.toString());
		System.out.println("\n\n"+b.toString());
	}
}
 class Wine{ //����
	public void fun1(){
		System.out.println("Wine ��fun1");
		fun2();
	}
	public void fun2(){
		System.out.println("Wine ��fun2");
	}
	public void fun4(){
		System.out.println("Wine ��fun4");
	}
}
class JNC extends Wine{
	public void fun1(String a){ //�����˸���ķ������븸�෽������ͬ����������һ�¡�
		System.out.println("JNC��fun1..");
		fun2();
	
	}
	public void fun1(){ //��д�˸���ķ������븸�෽������ͬ������һ�¡�
		System.out.println("JNC��fun100");
		fun2();
	
	}
	public void fun2(){//��д�˸���ķ������븸�෽������ͬ������һ�¡�
		System.out.println("JNC��fun2..");
	}

	public void fun2(String a){//�����˸���ķ������븸�෽������ͬ������һ�¡�
		System.out.println("JNC��fun2..");
	}
	public void fun3(){//������·����������޴˷�����
		System.out.println("JNC��fun3..");
	}
}
//���Զ��������࣬��������ͬһ��������д���Ա��ֳ���ͬ����Ϊ��
//��ʹ�ö�̬��ʽ���÷���ʱ�����ȼ�鸸�����Ƿ��д˷��������û������������������������ͬ������������������޴˷���������ø���ķ�����