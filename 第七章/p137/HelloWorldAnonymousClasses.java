/*
�������þֲ�������ʼ������englishGreeting������������ʼ������frenchGreeting��spanishGreeting������ʵ��֮�������Ե�����

1���ֲ���EnglishGreetin�̳�HelloWorld�ӿڣ����Լ����������������֮����Ҫ����new�ؼ���ʵ�����ſ���ʹ�ã�

2��frenchGreeting��spanishGreeting�ڶ����ʱ���ʵ�����ˣ��������˾Ϳ���ֱ��ʹ�ã�

3����������һ�����ʽ������ڶ��������÷ֺ�";"������
����ʵ��һ�����а�������һ���࣬�Ҳ���Ҫ�ṩ�κε�����ֱ��ʵ������
������������Ҫ��ʱ�򴴽�һ��������ִ���ض������񣬿���ʹ������Ӽ�ࡣ
*/

public class HelloWorldAnonymousClasses {

    /**
     * ��������������HelloWorld�ӿ�
     */
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
		public void a();
    }

    public void sayHello() {

        // 1���ֲ���EnglishGreetingʵ����HelloWorld�ӿ�
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

        // 2��������ʵ��HelloWorld�ӿڡ�����һ�������࣬ʵ��HelloWorld�ӿڡ�
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

        // 3��������ʵ��HelloWorld�ӿ�
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

��������������������һ�����ʽ����������﷨�������ڵ���һ����Ĺ���������new  HelloWorld()����
��Щ֮�⣬��������һ������飬�ڴ�����������Ķ���.
*/