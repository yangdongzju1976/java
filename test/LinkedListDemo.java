import java.util.LinkedList; 
 
public class LinkedListDemo {
	  private LinkedList<Node> body;
	
 
 
   public static void main(String[] args) {
	LinkedListDemo t=new LinkedListDemo();
	t.test();
   }
 
      // create a LinkedList
    
	public void test(){
		body=new LinkedList<>();
		body=new LinkedList<>();
		body.add(new Node(16,20));
		body.add(new Node(17,20));
		body.add(new Node(18,20));
		body.add(new Node(19,20));
		body.add(new Node(20,20));
		System.out.println("LinkedList:" +body);
 
      // remove the last element
      System.out.println("Last element:" + body.removeLast());
 
      // print the list
      System.out.println("LinkedList:" + body);
		
	}
   
 
      // print the list
    //  System.out.println("LinkedList:"+list);
 
      // remove the last element
     // System.out.println("Last element:" + list.removeLast());
 
      // print the list
      //System.out.println("LinkedList:" + list);
  
}