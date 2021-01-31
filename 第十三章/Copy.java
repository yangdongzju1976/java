import java.io.*;

public class  Copy{
	public static void main(String[] args)throws IOException{
		InputStream  input=new FileInputStream("a.txt");
		File myfile=new File("b.txt");
		myfile.createNewFile();
		if (myfile.isFile())
            {
				System.out.println("文件被创建");
            }
		
	   OutputStream output = new FileOutputStream("b.txt");
		int temp;
		while ((temp=input.read())!=-1)
		{
			output.write(temp);

		}
	 input.close();
	 output.close();
	}
	
}
