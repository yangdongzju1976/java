import java.io.File;

public class Test_1 {
    public static void main(String[] args) {
       //1.File(String path)
		File f=new File("c:/windows"); 
		File g=new File("a.txt");
		
		//�ж�File�Ķ���f���ļ�����Ŀ¼
		if (f.isFile())
        {
			System.out.println("f  is a file!");
        }else if(f.isDirectory())
				{
					System.out.println("f is a Directory!");
				}
		//�ж�File�Ķ���g���ļ�����Ŀ¼
		if (g.isFile())
        {
			System.out.println("g  is a file!");
        }else if (g.isDirectory())
			{
				System.out.println("g is a Directory!");
			}
		//2.File(String path, String name)��path ��·������name ���ļ�����

		File t=new File("c:/windows","notepad.exe");
		//3.File(File dir, String name)��dir ��·������name ���ļ�����
		File k=new File(f,"notepad.exe");
    }
}