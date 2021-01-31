import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
public class InputStreambyte{
	public static void main(String[] args){
		try{
			InputStream in=new FileInputStream("a.txt");
			
			  byte [] tt=new byte[9];//把记事本改了utf-8格式，输入中文
			  int b;
			  while((b=in.read(tt,6,3))!=-1){ 
			      System.out.println(b);
				  String tzt=new String(tt,"utf-8");
 			      System.out.println(tzt);
   }			}

   	catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
//read()返回的类型是什么类型---整形