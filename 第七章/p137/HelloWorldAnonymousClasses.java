/*
该例中用局部类来初始化变量englishGreeting，用匿类来初始化变量frenchGreeting和spanishGreeting，两种实现之间有明显的区别：

1）局部类EnglishGreetin继承HelloWorld接口，有自己的类名，定义完成之后需要再用new关键字实例化才可以使用；

2）frenchGreeting、spanishGreeting在定义的时候就实例化了，定义完了就可以直接使用；

3）匿名类是一个表达式，因此在定义的最后用分号";"结束。
可以实现一个类中包含另外一个类，且不需要提供任何的类名直接实例化。
用于在我们需要的时候创建一个对象来执行特定的任务，可以使代码更加简洁。
*/

public class HelloWorldAnonymousClasses {

    /**
     * 包含两个方法的HelloWorld接口
     */
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
		public void a();
    }

    public void sayHello() {

        // 1、局部类EnglishGreeting实现了HelloWorld接口
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
			public void a(){};
        }

        EnglishGreeting englishGreeting = new EnglishGreeting();

        // 2、匿名类实现HelloWorld接口。定义一个匿名类，实现HelloWorld接口。
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
			public void a(){System.out.println("a " + name);}
        };

        // 3、匿名类实现HelloWorld接口
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
			public void a(){System.out.println("ab " + name);}

        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
		frenchGreeting.a();
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
/*

如上文所述，匿名类是一个表达式，匿名类的语法就类似于调用一个类的构建函数（new  HelloWorld()），
除些之外，还包含了一个代码块，在代码块中完成类的定义.
*/