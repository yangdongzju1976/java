import java.io.*;

public class  FileOutStreamWrite{
	public static void main(String[] args)throws IOException{
		OutputStream output = new FileOutputStream("a.txt");
    output.write(72); // H
    output.write(101); // e
    output.write(108); // l
    output.write(108); // l
    output.write(111); // o
    output.write(32);
	byte[] tt=new byte[5];
	tt[0]=83;
	tt[1]=116;
	tt[2]=111;
	tt[3]=114;
	tt[4]=121;
	output.write(tt);
	 output.close();
	}
	
}
