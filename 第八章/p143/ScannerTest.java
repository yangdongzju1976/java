import java.util.Scanner;  //Scanner��һ���ࡣ���ǿ���ͨ�� Scanner ������ȡ�û������롣
public class ScannerTest
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in); //����Scanner���ʵ��input. Scanner.in��ȡ��׼�����豸���ݣ��ӱ�׼�����豸��ȡ���ݣ�һ���Ǽ��̣�
		int score;
		float f;
		//System.out.print("����ֵ��\nscore=");
		//score=input.nextInt();  //�Ӽ��̻�����룬�������Ĳ����������򱨴�nextInt()ֻ��������
		//System.out.println("�����\nscore = "+score);
		//----------------------------------------------------
		 /*if (input.hasNextInt()) {//��������ֵ��������Ϊ�棬����Ϊ�١�
            String str1 = input.next();//nextInt(),nextFloatֻ�ܽ������ͣ������͡�
            System.out.println("���������Ϊ��" + str1);
        }*/
		if (input.hasNextFloat()) {
            // �ж�������Ƿ���С��
            f = input.nextFloat();
            // ����С��
            System.out.println("С�����ݣ�" + f);
        } else {
            // ����������Ϣ
            System.out.println("����Ĳ���С����");
        }
		
		if (input.hasNextLine()) {
            String str2 = input.nextLine();
            System.out.println("���������Ϊ��" + str2);
        }
        while (input.hasNextInt())
        {
			System.out.println("��ӡ������������"+input.next());
        }
        input.close();

	}
}
/*
һ��next()��nextLine()����
next():nextInt() nextfloat()

1.һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������롣
2.��������Ч�ַ�֮ǰ�����Ŀհף�next()�������Զ�����ȥ����
3.ֻ��������Ч�ַ���Ž����������Ŀհ���Ϊ�ָ������߽�������
next()���ܵõ����пո���ַ�����
nextLine()��

1.��EnterΪ������,Ҳ����˵nextLine()�������ص�������س�֮ǰ�������ַ���
2.���Ի�ÿհס�

����Scanner.close()�ı�Ҫ��
ʹ��Scanner��system.in��ʱ��ʹ����Ϻ�һ��Ҫ�ر�ɨ��������Ϊsystem.in����IO����һ���򿪣���һֱ��ռ����Դ��
���ʹ����Ϻ��м�Ҫ�رա�

���������÷�

1.�鿴�ಢ������
//������Ҫimport�����ʹ��
import java.util.Scanner��

2. �鿴���췽��
// ����һ���µ�Scanner�������ɵ�ֵ�Ǵ�ָ����������ɨ������
public Scanner��InputStream source����

3. ��������
Scanner scan = new Scanner(System.in);

4. Scanner��Ļ�������
ͨ�� Scanner ��� next() �� nextLine() �������Ի�ȡ������ַ������ڶ�ȡǰһ����Ҫʹ�� hasNext() �� hasNextLine() 
�ж��Ƿ�����������ݡ�
*/