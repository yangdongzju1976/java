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
	  String pattern2 = ".[0-9]";// . （点） 任意字符
	  String pattern3 = "[0-9a-z]{1,}";
	  String pattern4 = "[a-zA-Z]{1,}";
	  String pattern5 ="^[0-9]{1,}[a-zA-Z]{1,}[1-9]";
	  String pattern6 = "^a=\\d+\\w+";	
	/*
	[ ]   (中括号)					范围字符[abc]
	表示字母abc中的任意一个[a-z]						
	表示字母a到z中的任意一个[^abc]  ^ 为取非， 除了abc， 剩下的全部字符
	[abc[def]]	这种写法为并集，意为abcdef中的任意一个[abc&[bce]]					
	& 表示与， 也就是交集。 abc 与上 bce, 最终结果为bc

	? 表示1个或0个。换句话说，表示要不然没有，要不然只有1个
	* 表示0个或多个。
	+ 表示1个或多个。
	{n} 表示正好n个
	{n,m} 表示n到m个，这是一个左闭右闭区间
	{n,} 表示至少n个
	^ 匹配一行的开始位置
	$ 匹配一行的结束位置
	\w (反斜杠加小写字母w) 单词字符： 小写字母a-z， 大写字母A-Z， 数字0-9， 下划线 _
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
		  System.out.printf("QQ:"+qq+"\t号码合法\n");
	  }
	  else
	   {
			System.out.printf("QQ:"+qq+"\t号码不合法\n");
	   }
   }
}
