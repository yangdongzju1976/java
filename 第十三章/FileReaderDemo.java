import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
public class FileReaderDemo{
	public static void main(String[] args){
		try{
			//���ֽڶ�ȡ�ļ���
		InputStream in=new FileInputStream("a.txt");
		int len=-1;
		//read()����δβ�ͻ᷵��-1
		while ((len=in.read())!=-1)
		{
			System.out.println(len);
		}
		in.close();//�ر���
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
}