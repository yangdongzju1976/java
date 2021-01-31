public class  SystemProperty
{
	public static void main(String[] args) 
	{
		String jversion = System.getProperty("java.version");
        String oName = System.getProperty("os.name");
        String user = System.getProperty("user.name");
        System.out.println("Java 运行时环境版本："+jversion);
        System.out.println("当前操作系统是："+oName);
        System.out.println("当前用户是："+user);
	}
}
