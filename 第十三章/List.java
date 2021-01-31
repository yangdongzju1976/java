import java.io.File;
public class List{
	public static void main(String[] args) 
	{
		File f=new File("c:/");
		String data[]=f.list();
		for (String string:data )
		{
			System.out.println(string);
		}
		
	}
}
