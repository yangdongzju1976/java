public class InterImp implements Inter<String> //ʵ�ֵ�ͬʱָ������ķ��� 
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
