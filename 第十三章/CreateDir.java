import java.io.*;
public class CreateDir {
    public static void main(String[] args) {
        String path = "d:/config"; // ָ��Ŀ¼λ��
        File f = new File(path); // ����File����
        if (f.exists()) {
            f.delete();
        }
        f.mkdir(); // ����Ŀ¼ ����boolean��
		//ѭ������Ŀ¼----���������ڵ���Ŀ¼
		String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}