
//��MammalIntʵ�ֽӿ�Animal
public class MammalInt implements Animal{ 
	
	//ʵ�ֽӿڵ�eat()����
   public void eat(){
      System.out.println("Mammal eats");
   }
	//ʵ�ֽӿڵ�travel()����
   public void travel(){
      System.out.println("Mammal travels");
   } 
	//MammalInt�Լ��ķ���
   public int noOfLegs(){
      return 0;
   }
 
   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
}