public class StringBufferDemo{
	public static void main(String[] args){
		StringBuffer s=new StringBuffer();
		//s="hello"; ����ֻ��String��ſ���ֱ�Ӹ�ֵ
		String  s1=s.toString();
		System.out.println("s1="+s1);
		s.append("hello");//׷��
		s.append(" world").append("!").append("java");
		System.out.println(s);
		s.replace(0,5,"HELLO");//�����޸ĵڶ�������
		System.out.println("s.replace(0,5,'HELLO')��   "+s);
		s.replace(0,0,"HELLO");//�޸ĵڶ���������
		System.out.println("s.replace(0,0,'HELLO')��   "+s); //���
		s.subSequence(0,2);//����һ���´�
		System.out.println(s.subSequence(0,2));
		System.out.println("s="+s);
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.indexOf(ld)="+s.indexOf("ld"));//�����Ӵ���ld�����ַ�����λ��
		System.out.println("s.reverse()="+s.reverse()); //�ַ�����ת

		
		System.out.println("s1="+s1.toString());

	}
}