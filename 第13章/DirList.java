import java.io.File;
/*
Java文件类以抽象的方式代表文件名和目录路径名。该类主要用于文件和目录的创建、文件的查找和文件的删除等。
File对象代表磁盘中实际存在的文件和目录
*/
public class DirList {
    public static void main(String args[]) {
        String dirname = "/";
        File f1 = new File(dirname); //通过构造器创建对象
        if (f1.isDirectory()) { //public boolean isDirectory()  测试此抽象路径名表示的文件是否是一个目录。
            System.out.println("Directory of " + dirname);
            String s[] = f1.list();
			/*
			public String[] list()
			返回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组。
			*/
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]); //构造器创建对象
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