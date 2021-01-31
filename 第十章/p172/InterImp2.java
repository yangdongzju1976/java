public class InterImp2<Q> implements Inter<Q> //在子类的定义时再次定义泛型
{
	@Override
		public  void show(Q q){
			System.out.println("show:"+q);
	}
	public static void main(String args[])
	{
		//在实例化的时候去指定具体的泛型。
		InterImp2 <Integer> a=new InterImp2<>();//InterImp2<Integer>()
		a.show(123);
		show1(456);
		a.show2(789);//错误
	}
	public static void show1(int a){
		System.out.println("show:"+a);
	}
	public void show2(int a){
		System.out.println("show:"+a);
	}

}
