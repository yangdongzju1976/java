public class Recipe{ //����
    public static void  main(String args[]) { //������
        Food breakfast=new Food("bread");  //ͨ�����캯��������Food�Ķ���breakfast
        Food lunch=new Food("noddle");
        Food dinner=new Food();
        dinner.setFood_name("pizza");
		System.out.println("my breakfast is "+breakfast.getFood_name()+"\n");//
        System.out.println("my lunch is "+lunch.getFood_name()+"\n");
        System.out.println("my dinner is "+dinner.getFood_name()+"\n");
    }
}
 // lunch.setFood_name("nuddle");
 // breakfast.setFood_name("bread"); //����setFood_name������Ϊfoodname��ֵ