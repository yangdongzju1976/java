import java.io.File;
/*
Java�ļ����Գ���ķ�ʽ�����ļ�����Ŀ¼·������������Ҫ�����ļ���Ŀ¼�Ĵ������ļ��Ĳ��Һ��ļ���ɾ���ȡ�
File������������ʵ�ʴ��ڵ��ļ���Ŀ¼
*/
public class DirList {
    public static void main(String args[]) {
        String dirname = "/";
        File f1 = new File(dirname); //ͨ����������������
        if (f1.isDirectory()) { //public boolean isDirectory()  ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼��
            System.out.println("Directory of " + dirname);
            String s[] = f1.list();
			/*
			public String[] list()
			�����ɴ˳���·��������ʾ��Ŀ¼�е��ļ���Ŀ¼������������ַ������顣
			*/
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]); //��������������
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}