import java.io.File;

public class CreateFile {
   public static void main(String[] args) {
        try{
		  File file = new File("D:\\3.txt");
               file.createNewFile();    
            if (file.isFile())
            {
				System.out.println("�ļ�������");
            }
			file.delete();
			 if (file.isFile())
            {
				System.out.println("�ļ���Ȼ����");
            }
			else
			{
				System.out.println("�ļ���ɾ��");
			}
     }catch(Exception e){
        e.printStackTrace();
      }
   }
}
/*
     * createNewFile() ���������ݳ���·������һ���µĿ��ļ���������·���µ��ļ�����ʱ������ʧ��
     * ���E:/test Ŀ¼��û�� 1.txt�ļ����򴴽����ļ������1.txt�Ѿ����ڣ���ô�ļ�����ʧ��
     * ���û��testĿ¼����ֱ���׳��쳣��
    */
