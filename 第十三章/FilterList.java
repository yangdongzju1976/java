import java.io.*;

public class FilterList 
{
	public static void main(String[] args) 
	{
		File f=new File("c:/");
		//ʹ��FilenameFilter������
		String data[]=f.list(new FilenameFilter(){
			@Override
				public boolean accept(File dir,String name){//�÷������ָ����File���Ŀ¼�е��ļ����м�����ͨ��ָ���Ĺ��򷵻�һ��booleanֵ �����Ϊ��list()����ļ��г���
					//������txt��β���ļ�
					return name.endsWith(".txt");
				}
		});
		for (String string:data )
		{
			System.out.println(string);
		}
	}
}
