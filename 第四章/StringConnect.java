public class StringConnect
{
	public static void main(String[] args) 
	{
		double jan=98.978;
		double  feb=76;
		double total=jan+feb;
		String flow="Jannuary DataFlow is:"+jan;
		String sflow="The total DataFlow if :"+total;
		System.out.println(flow);
		System.out.println(sflow);
		System.out.println(""+jan+feb);//与下一条语句输入的差异。
		System.out.println(jan+feb);//+号连接的输出项，如果有一个为字符串，则其他的都转换为字符串。

	}
}
//p80
