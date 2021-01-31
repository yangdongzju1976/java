public class StringBufferDemo{
	public static void main(String[] args){
		StringBuffer s=new StringBuffer();
		//s="hello"; 错误，只有String类才可以直接赋值
		String  s1=s.toString();
		System.out.println("s1="+s1);
		s.append("hello");//追加
		s.append(" world").append("!").append("java");
		System.out.println(s);
		s.replace(0,5,"HELLO");//请再修改第二个参数
		System.out.println("s.replace(0,5,'HELLO')：   "+s);
		s.replace(0,0,"HELLO");//修改第二个参数后
		System.out.println("s.replace(0,0,'HELLO')：   "+s); //输出
		s.subSequence(0,2);//返回一个新串
		System.out.println(s.subSequence(0,2));
		System.out.println("s="+s);
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.indexOf(ld)="+s.indexOf("ld"));//返回子串“ld”在字符串的位置
		System.out.println("s.reverse()="+s.reverse()); //字符串反转

		
		System.out.println("s1="+s1.toString());

	}
}