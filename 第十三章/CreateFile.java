import java.io.File;

public class CreateFile {
   public static void main(String[] args) {
        try{
		  File file = new File("D:\\3.txt");
               file.createNewFile();    
            if (file.isFile())
            {
				System.out.println("文件被创建");
            }
			file.delete();
			 if (file.isFile())
            {
				System.out.println("文件依然存在");
            }
			else
			{
				System.out.println("文件被删除");
			}
     }catch(Exception e){
        e.printStackTrace();
      }
   }
}
/*
     * createNewFile() 方法，根据抽象路径创建一个新的空文件，当抽象路径下的文件存在时，创建失败
     * 如果E:/test 目录下没有 1.txt文件，则创建该文件；如果1.txt已经存在，那么文件创建失败
     * 如果没有test目录，则直接抛出异常；
    */
