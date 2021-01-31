class Animal {
	int age;
  void eat() {
    System.out.println("animal : eat");
  }
}
 
class Dog extends Animal {
	
  void eat() {
	  super.age=10;
    System.out.println("dog : eat"+super);
  }
  void eatTest() {
    this.eat();   // this 调用自己的方法
    super.eat();  // super 调用父类方法
  }
}
 
public class Test1 {
  public static void main(String[] args) {
    Animal a = new Animal();
    a.eat();
    Dog d = new Dog();
    d.eatTest();
  }
}
//第六章 第一外测试题
