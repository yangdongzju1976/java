import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
public class FileReaderDemo{
	public static void main(String[] args){
		try{
			//按字节读取文件。
		InputStream in=new FileInputStream("a.txt");
		int len=-1;
		//read()读到未尾就会返回-1
		while ((len=in.read())!=-1)
		{
			System.out.println(len);
		}
		in.close();//关闭流
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
}