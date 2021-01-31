/*
匿名类是指没有类名的内部类，必须在创建时使用 new 语句来声明类。其语法形式如下：

new <类或接口>() {
    // 类的主体
};
这种形式的 new 语句声明一个新的匿名类，它对一个给定的类进行扩展，或者实现一个给定的接口。
使用匿名类可使代码更加简洁、紧凑，模块化程度更高。
*/

class person{

    public void method(){
        System.out.println("父类方法");
    }
	public void a(){}
	public void a(int i){}

}



public class Anonymous_inner_class {
    public static void main(String[] args) {
        person p = new person(){//匿名内部类。没有定义类(没有类名)，只是创建了一个对象而已。
            @Override
            public void method() {
                System.out.println("重写父类方法");
			
            }
			public void a(){  //只能重写父类方法，不能重载父方法。
				System.out.println("a方法");
			}
			public void a(int i){
				for (int j=0;j<i ;j++ )
				{
					System.out.printf("j=%d\n",j);
				}
			}
        };
        p.method();
		p.a(5);
		p.a();

    }
}

