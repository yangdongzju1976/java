import java.io.File;

public class Test_1 {
    public static void main(String[] args) {
       //1.File(String path)
		File f=new File("c:/windows"); 
		File g=new File("a.txt");
		
		//判断File的对象f是文件还是目录
		if (f.isFile())
        {
			System.out.println("f  is a file!");
        }else if(f.isDirectory())
				{
					System.out.println("f is a Directory!");
				}
		//判断File的对象g是文件还是目录
		if (g.isFile())
        {
			System.out.println("g  is a file!");
        }else if (g.isDirectory())
			{
				System.out.println("g is a Directory!");
			}
		//2.File(String path, String name)：path 是路径名，name 是文件名。

		File t=new File("c:/windows","notepad.exe");
		//3.File(File dir, String name)：dir 是路径对象，name 是文件名。
		File k=new File(f,"notepad.exe");
    }
}