public class StringConstractor{
	
public static void main(String[] args) {
 
        String s1 = new String();
 
        System.out.println("s1="+s1);
 
        String s2="hello";
		System.out.println("s2="+s2);

 
        byte[] arr1 = {97,98,99};        
 
        String s3 = new String(arr1);            //解码,将计算机读的懂的转换成我们读的懂
 
        System.out.println("s3="+s3);
 
        
 
        byte[] arr2 = {97,98,99,100,101,102};
 
        String s4 = new String(arr2,2,3);        //将arr2字节数组从2索引开始转换3个
 
        System.out.println("s4="+s4);
 
        
 
        char[] arr3 = {'a','b','c','d','e'};    //将字符数组转换成字符串
 
        String s5 = new String(arr3);
 
        System.out.println("s5="+s5);
 
        
 
        String s6 = new String(arr3,1,3);        //将arr3字符数组,从1索引开始转换3个
 
        System.out.println("s6="+s6);
 
        
 
        String s7 = new String("xiaoshuai");
		String s8=s7.replace('x','A');
		String s9=s7.replace("xiao","Da");
        System.out.println("s7="+s7);
		System.out.println("s8="+s8);
		System.out.println("s9="+s9);
		System.out.println("s9的长度："+s9.length());  //length()长度方法
		String s10="  World";
		s2.concat(s10);  //String类字符串一旦被创建就不能被改变
		System.out.println("s2="+s2+" s10="+s10);
		System.out.println("s2+s10="+s2.concat(s10));
 
    }
}