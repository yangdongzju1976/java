import java.io.*;

public class FilterList 
{
	public static void main(String[] args) 
	{
		File f=new File("c:/");
		//使用FilenameFilter过滤器
		String data[]=f.list(new FilenameFilter(){
			@Override
				public boolean accept(File dir,String name){//该方法会对指定的File类的目录中的文件进行检索，通过指定的规则返回一个boolean值 ，如果为真list()会把文件列出。
					//返回以txt结尾的文件
					return name.endsWith(".txt");
				}
		});
		for (String string:data )
		{
			System.out.println(string);
		}
	}
}
