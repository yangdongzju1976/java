public class  SystemProperty
{
	public static void main(String[] args) 
	{
		String jversion = System.getProperty("java.version");
        String oName = System.getProperty("os.name");
        String user = System.getProperty("user.name");
        System.out.println("Java ����ʱ�����汾��"+jversion);
        System.out.println("��ǰ����ϵͳ�ǣ�"+oName);
        System.out.println("��ǰ�û��ǣ�"+user);
	}
}
