public class Question 
{
	public static void main(String[] args) 
	{
		Student[] array=new Student[5];//���鶨�壬ע���ʽ
		array[0]=new Student(); //�����ÿһ��Ԫ�ض���һ�����󡣶�����Ҫ��һ���ɡ�
		array[0].age=12;
		array[0].name="ZhangShan";
		array[1]=new Student();
		array[1].age=13;
		array[1].name="LiShi";
		array[2]=new Student();
		array[2].age=14;
		array[2].name="WangWu";
		array[3]=new Student();
		array[3].age=15;
		array[3].name="LiuLiu";
		array[4]=new Student();
		array[4].age=16;
		array[4].name="ZhaoQi";
		Output(array,0);
	}
	static Student[] Output(Student array[],int i){ //�����Ķ��塣����Ĵ�С��������.lengthֵ�룬����Ҫ�������������Ҳ����Ҫ����ֵ��
		for (i=0;i<array.length ;i++ )
		{
			System.out.println("name:"+array[i].name+"\tage:"+array[i].age);
		}
		return array;
		
	}
}

class Student //����һ��Student�ࡣ
{
	int age;
	String name;
}

//p93 �����
/*
���ʵ�֣�
1������һ��Student�࣬���а����������ԣ������������
2�������ࣨ����main()���ࣩ����һ��Student���͵����飨5��Ԫ�����ң��������и�ֵ��
3���������ж���һ���������������ĸ���Ԫ�ص�ֵ��

*/
