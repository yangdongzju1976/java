import java.io.File;
import java.util.Date;
public class Test {
    public static void main(String[] args) {
        String path = "C:\\windows\\"; // ָ���ļ����ڵ�Ŀ¼
        File f = new File(path, "notepad.exe"); // ����File����,���趨��f��������
        System.out.println("C:\\windows\\notepad.exe�ļ���Ϣ���£�");
        System.out.println("============================================");
        System.out.println("�ļ����ȣ�" + f.length() + "�ֽ�");
        System.out.println("�ļ�����Ŀ¼��" + (f.isFile() ? "���ļ�" : "�����ļ�"));
        System.out.println("�ļ�����Ŀ¼��" + (f.isDirectory() ? "��Ŀ¼" : "����Ŀ¼"));
        System.out.println("�Ƿ�ɶ���" + (f.canRead() ? "�ɶ�ȡ" : "���ɶ�ȡ"));
        System.out.println("�Ƿ��д��" + (f.canWrite() ? "��д��" : "����д��"));
        System.out.println("�Ƿ����أ�" + (f.isHidden() ? "�������ļ�" : "���������ļ�"));
        System.out.println("����޸����ڣ�" + new Date(f.lastModified())); //�ò����Ǵ�1970��1��1����ĺ�������
		//System.out.println("����޸����ڣ�" +(f.lastModified()));
		System.out.println("�ļ����ƣ�" + f.getName());
        System.out.println("�ļ�·����" + f.getPath());
        System.out.println("����·����" + f.getAbsolutePath());

    }
}