/*
在类中定义静态的属性（成员变量），在 main() 方法中可以直接访问，也可以通过类名访问，还可以通过类的实例对象来访问。

注意：静态变量是被多个实例所共享的。
*/
public class StaticVar {
    public static String str1 = "Hello";
    public static void main(String[] args) {
        String str2 = "World!";
        // 直接访问str1
        String accessVar1 = str1+str2;
        System.out.println("第 1 次访问静态变量，结果为："+accessVar1);
        // 通过类名访问str1
        String accessVar2 = StaticVar.str1+str2;
        System.out.println("第 2 次访问静态变量，结果为："+accessVar2);
        // 通过对象svt1访问str1
        StaticVar svt1 = new StaticVar();
        svt1.str1 = svt1.str1+str2;
        String accessVar3 = svt1.str1;
        System.out.println("第3次访向静态变量，结果为："+accessVar3);
        // 通过对象svt2访问str1
        StaticVar svt2 = new StaticVar();
        String accessVar4 = svt2.str1+str2;
        System.out.println("第 4 次访问静态变量，结果为："+accessVar4);
		System.out.println("第 4 次访问静态变量，结果为："+str1);
    }
}