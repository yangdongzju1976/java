import java.io.IOException;
public class	SystemTest  
{
	public static void main(String[] args) 
	{
		System.out.println("�������ַ������س�����������:");
		 int c;
		 try {
		  c = System.in.read();    // ��ȡ������ַ�
            while(c != '\r') {    // �ж�������ַ��ǲ��ǻس�
                System.out.println( c);    // ����ַ�
                c = System.in.read();
			}
		 }
			catch(IOException e) {
            System.out.println(e.toString());
        } finally {
            System.err.println();
        }
	}
}


/*
System ���� 3 ����̬��Ա�������ֱ��� PrintStream out��InputStream in �� PrintStream err.
		PrintStream��:�������������͵����ݸ�ʽ�����ַ��������
		PrintStream out:��׼������������Ѵ򿪲�׼������������ݡ�ͨ����������Ӧ����ʾ����������������������û�ָ������һ�����Ŀ�ꡣ
		InputStream in:��׼�������������Ѵ򿪲�׼���ṩ�������ݡ�ͨ����������Ӧ�ڼ�����������������������û�ָ������һ������Դ��
*/
