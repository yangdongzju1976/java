//传值 调用
public class CallByValuePri
{
	void half(int n){
		n=n/2;
		System.out.println("\n在half方法中n="+n);
	}
	
	public static void main(String args[]){
		CallByValuePri cb=new CallByValuePri();
		int m=10;
		System.out.println("调用之前,m="+m);
		cb.half(m);								//传值调用
		System.out.println("\n调用之后，m="+m+"\n"); 
	}
}