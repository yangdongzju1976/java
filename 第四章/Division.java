//p51 ��������
public  class Division 
{
	public static void main(String agrs[]) 
	{	
		//��������
		System.out.println("\t��������");
		System.out.println("123.0/0="+123.0/0);
		//System.out.println("123/0="+123/0);
		//ȡģ���� ����java��˵��������������Ǹ�������������Ҳ���Ǹ�������
		System.out.println("\tȡģ����");
		System.out.println("123.5 mod 4="+123.5%4);
		System.out.println("123 mod 4="+123%4);
		//��Ԫ�������ݸ�ֵ��ʽ
		int a=5,b;
		System.out.println("\t��Ԫ������ļ�ݸ�ֵ����\n\ta="+a);
		a+=5;//�൱�� a=a+5
		System.out.println("a+=5   a="+a);
		a-=5;//�൱�� a=a-5;
		System.out.println("a-=5   a="+a);
		a*=5;//�൱�� a=a*5
		System.out.println("a*=5   a="+a);
		a/=5;//�൱�� a=a/5
		System.out.println("a/=5   a="+a);
		a%=5;//�൱�� a=a%5 ȡ������
		System.out.println("a%=5   a="+a);
		//��ϵ�����
		System.out.println("��ϵ����");
		System.out.print("4<5\t");
		System.out.println(4<5);
		System.out.print("4>5\t");
		System.out.println(4>5);
		System.out.print("4==5\t");
		System.out.println(4==5);
		System.out.print("4!=5\t");
		System.out.println(4!=5);
		//�߼������
		System.out.println("\t�߼�����");
		System.out.print("������4<5|4>5\t\t");
		System.out.println(4<5|4>5);
		System.out.print("������4<5&4>5\t\t");
		System.out.println(4<5&4>5);
		System.out.print("������!true\t\t");
		System.out.println(!true);
		System.out.print("������!flase\t\t");
		System.out.println(!false);
		System.out.print("�������4<5^4>2\t\t");
		System.out.println(4<5^4>2);
		System.out.print("�������4<5^4>5\t\t");
		System.out.println(4<5^4>5);
		System.out.println("\t��Ԫ�����");
		int m=10,n=20,t;
		t=m>n?m:n;
		//System.out.println("m="+m+"n="+n+"m>n?m:n��ֵΪ:"+m>n?m:n);
		System.out.println("m="+m+"\tn="+n+"\tm>n?m:n��ֵΪ:"+t);
		System.out.println("\t����/�ݼ��������");
		a=10;
		b=10;
		System.out.println("����ǰ��a="+a+"\tb="+b);
		m=2*++a;
		n=2*b++;
		System.out.println("2*++a��ֵΪ��"+m);
		System.out.println("2*b++��ֵΪ��"+n);
		System.out.println("�����a="+a+"\tb="+b);

	
	}

}
