import java.io.*;
public class CreateDir {
    public static void main(String[] args) {
        String path = "d:/config"; // 指定目录位置
        File f = new File(path); // 创建File对象
        if (f.exists()) {
            f.delete();
        }
        f.mkdir(); // 创建目录 返回boolean型
		//循环创建目录----创建不存在的子目录
		String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}