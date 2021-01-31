
//类MammalInt实现接口Animal
public class MammalInt implements Animal{ 
	
	//实现接口的eat()方法
   public void eat(){
      System.out.println("Mammal eats");
   }
	//实现接口的travel()方法
   public void travel(){
      System.out.println("Mammal travels");
   } 
	//MammalInt自己的方法
   public int noOfLegs(){
      return 0;
   }
 
   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
}