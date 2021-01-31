public class Question 
{
	public static void main(String[] args) 
	{
		Student[] array=new Student[5];
		array[0]=new Student();
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
	static Student[] Output(Student array[],int i){
		for (i=0;i<array.length ;i++ )
		{
			System.out.println("name:"+array[i].name+"\tage:"+array[i].age);
		}
		return array;
		
	}
}

class Student //定义一个Student类。
{
	int age;
	String name;
}

//p93 编程题
/*
编程实现：
1、定义一个Student类，类中包含两个属性，年龄和姓名。
2、在主类（包含main()的类）定义一个Student类型的数组（5个元素左右）。并进行赋值。
3、在主类中定义一个方法，输出数组的各个元素的值。

*/
