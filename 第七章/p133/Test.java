public class Test{
	public static void main(String[] args) 
	{
		//���常������
		Wine[] wines=new Wine[2];
		//������������
		JNC jnc=new JNC();
		JGJ jgj=new JGJ();
		//���������������
		wines[0]=jnc;
		wines[1]=jgj;
		for (int i=0;i<2 ;i++ )
		{
			System.out.println(wines[i].toString()+"-----"+wines[i].drink());
		}
		

		Object o=new Wine();
		System.out.println(o.toString());
		//JNC j=new Wine(); 
		Wine w=new JNC(); //��������ת����
		JNC j=(JNC)w;
	}
}
