public class MyClass{   //定义MyClass 类
    int classID;	//属性 classID
    String className;  //属性 className
    int studentNumber; //属性 studentNumber
    static Teacher myTeacher;  //定义一个属性，这个属性本身是个对象，Teacher:类名，myTeacher:对象名
    public static String ChangeTeacher(Teacher t){ //方法名 参数是一个Teacher类构造的对象t
        System.out.println("change a teacher"); //输出语句
        myTeacher=t; //t和myTeacher都指向同一个对象t.
        return myTeacher.name;
    }
    public static void main(String args[]){ //主函数
		String getName;//定义一个字符串变量
        System.out.println("\nHello\tWorld\n");//输出语句
        Teacher wang=new Teacher("Wang Hui");//用构造函数创建对象wang
        System.out.println(wang.name);//输出对象wang的属性值
		getName=ChangeTeacher(wang);//调用主类的函数ChangeTeacher，并传递参数wang
		System.out.println(getName);//输出字符串getName
		System.out.println(ChangeTeacher(wang));//把主类函数的调用返回值输出。
    }

}
