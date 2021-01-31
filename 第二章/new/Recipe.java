public class Recipe{ //主类
    public static void  main(String args[]) { //主方法
        Food breakfast=new Food("bread");  //通过构造函数创建类Food的对象breakfast
        Food lunch=new Food("noddle");
        Food dinner=new Food();
        dinner.setFood_name("pizza");
		System.out.println("my breakfast is "+breakfast.getFood_name()+"\n");//
        System.out.println("my lunch is "+lunch.getFood_name()+"\n");
        System.out.println("my dinner is "+dinner.getFood_name()+"\n");
    }
}
 // lunch.setFood_name("nuddle");
 // breakfast.setFood_name("bread"); //调用setFood_name方法，为foodname赋值