public class InterImp implements Inter<String> //实现的同时指定具体的泛型 
{
	@Override
		public void show(String str){
			System.out.println("show:"+str);
	}
	public static void main(String args[])
	{
		InterImp a=new InterImp();
		a.show("hello World");
	}
}
