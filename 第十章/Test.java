//����һ�������࣬������������������
public class Test<T>
{	public  void show(T t){
		System.out.println(t);
	}
     public void print(T t){
    	System.out.println(t);
  }	
  /*  ��ǰ���������壬����һ�������㶨
  	public void show(String t){	
	}
	public void show(Integer t){	
	}
	����
	public void show(Object obj){	
	}
  */


//��manin������������
	public static void main(String[] args) {
	   
		Test<String> d = new Test<String>();
		d.show("java");
		d.print("Object-C");
		
		Test<Integer> e = new Test<Integer>();
		e.show(2);
		e.print(new Integer(5));	
	}
	}