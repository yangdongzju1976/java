import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
public class InputStreambyte{
	public static void main(String[] args){
		try{
			InputStream in=new FileInputStream("a.txt");
			
			  byte [] tt=new byte[9];//�Ѽ��±�����utf-8��ʽ����������
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
//read()���ص�������ʲô����---����