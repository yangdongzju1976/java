public class InterImp2<Q> implements Inter<Q> //������Ķ���ʱ�ٴζ��巺��
{
	@Override
		public  void show(Q q){
			System.out.println("show:"+q);
	}
	public static void main(String args[])
	{
		//��ʵ������ʱ��ȥָ������ķ��͡�
		InterImp2 <Integer> a=new InterImp2<>();//InterImp2<Integer>()
		a.show(123);
		show1(456);
		a.show2(789);//����
	}
	public static void show1(int a){
		System.out.println("show:"+a);
	}
	public void show2(int a){
		System.out.println("show:"+a);
	}

}
