public class StringConstractor{
	
public static void main(String[] args) {
 
        String s1 = new String();
 
        System.out.println("s1="+s1);
 
        String s2="hello";
		System.out.println("s2="+s2);

 
        byte[] arr1 = {97,98,99};        
 
        String s3 = new String(arr1);            //����,����������Ķ���ת�������Ƕ��Ķ�
 
        System.out.println("s3="+s3);
 
        
 
        byte[] arr2 = {97,98,99,100,101,102};
 
        String s4 = new String(arr2,2,3);        //��arr2�ֽ������2������ʼת��3��
 
        System.out.println("s4="+s4);
 
        
 
        char[] arr3 = {'a','b','c','d','e'};    //���ַ�����ת�����ַ���
 
        String s5 = new String(arr3);
 
        System.out.println("s5="+s5);
 
        
 
        String s6 = new String(arr3,1,3);        //��arr3�ַ�����,��1������ʼת��3��
 
        System.out.println("s6="+s6);
 
        
 
        String s7 = new String("xiaoshuai");
		String s8=s7.replace('x','A');
		String s9=s7.replace("xiao","Da");
        System.out.println("s7="+s7);
		System.out.println("s8="+s8);
		System.out.println("s9="+s9);
		System.out.println("s9�ĳ��ȣ�"+s9.length());  //length()���ȷ���
		String s10="  World";
		s2.concat(s10);  //String���ַ���һ���������Ͳ��ܱ��ı�
		System.out.println("s2="+s2+" s10="+s10);
		System.out.println("s2+s10="+s2.concat(s10));
 
    }
}