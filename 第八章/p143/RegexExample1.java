import java.util.regex.*;
 
class RegexExample1{
   public static void main(String args[]){
      String content1 = "I am noob "+"from runoob.com.";
	  String content2 = "18";//8
	  String content3 = "32423423sdafasdf";
	  String content4 = "Hello";
	  String content5 = "732482SDJlfsSDJF6";
	  String content6 = "a=124_"; 	//=124_a=789_a=490

 
      String pattern1 = ".*runoob.*";
	  String pattern2 = ".[0-9]";// . ���㣩 �����ַ�
	  String pattern3 = "[0-9a-z]{1,}";
	  String pattern4 = "[a-zA-Z]{1,}";
	  String pattern5 ="^[0-9]{1,}[a-zA-Z]{1,}[1-9]";
	  String pattern6 = "^a=\\d+\\w+";	
	/*
	[ ]   (������)					��Χ�ַ�[abc]
	��ʾ��ĸabc�е�����һ��[a-z]						
	��ʾ��ĸa��z�е�����һ��[^abc]  ^ Ϊȡ�ǣ� ����abc�� ʣ�µ�ȫ���ַ�
	[abc[def]]	����д��Ϊ��������Ϊabcdef�е�����һ��[abc&[bce]]					
	& ��ʾ�룬 Ҳ���ǽ����� abc ���� bce, ���ս��Ϊbc

	? ��ʾ1����0�������仰˵����ʾҪ��Ȼû�У�Ҫ��Ȼֻ��1��
	* ��ʾ0��������
	+ ��ʾ1��������
	{n} ��ʾ����n��
	{n,m} ��ʾn��m��������һ������ұ�����
	{n,} ��ʾ����n��
	^ ƥ��һ�еĿ�ʼλ��
	$ ƥ��һ�еĽ���λ��
	\w (��б�ܼ�Сд��ĸw) �����ַ��� Сд��ĸa-z�� ��д��ĸA-Z�� ����0-9�� �»��� _
	*/

 
      boolean isMatch1 = Pattern.matches(pattern1, content1);
	  boolean isMatch2 = Pattern.matches(pattern2, content2);
	  boolean isMatch3 = Pattern.matches(pattern3, content3);
	  boolean isMatch4 = Pattern.matches(pattern4, content4);
	  boolean isMatch5 = Pattern.matches(pattern5, content5);
	  boolean isMatch6 = Pattern.matches(pattern6, content6);
      System.out.println("pattern:"+pattern1+"   "+content1+"  " + isMatch1);
	  System.out.println("pattern:"+pattern2+"   "+content2+"  " + isMatch2);
	  System.out.println("pattern:"+pattern3+"   "+content3+"  " + isMatch3);
	  System.out.println("pattern:"+pattern4+"   "+content4+"  " + isMatch4);
	  System.out.println("pattern:"+pattern5+"   "+content5+"  " + isMatch5);
	  System.out.println("pattern:"+pattern6+"   "+content6+"  " + isMatch6);
		checkQQ();
   }
   public static void checkQQ(){
	  String qq="1231242a";
	  //^\d{5,11}$
	  String regex="[1-9][0-9]{4,11}";
	  boolean flag=qq.matches(regex);
	  if (flag)
	  {
		  System.out.printf("QQ:"+qq+"\t����Ϸ�\n");
	  }
	  else
	   {
			System.out.printf("QQ:"+qq+"\t���벻�Ϸ�\n");
	   }
   }
}
