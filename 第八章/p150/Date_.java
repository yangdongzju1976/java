import java.util.*;// java.util.Date ��� java.util.Calendar ��
import java.text.*; //
public class Date_
{
	public static void main(String[] args) 
	{
		Date date=new Date();
		//1.�����ǰʱ��
		System.out.println("date="+date);//�����ǰʱ��
		System.out.println("date="+date.getTime());//1970�������ĺ�����
		//2.����һ��long����ֵ,��ʾ��ʱ��ԭ��֮��
		Date d2 = new Date(23244000);   //����һ��long����ֵ,��ʾ��ʱ��ԭ��֮��
        System.out.println("d2="+d2);
		//3.�������ڸ�ʽ������y��M��d��h��m��s�ȶ�����̶��ĺ���
		DateFormat d3 = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");   //�������ڸ�ʽ������y��M��d��h��m��s�ȶ�����̶��ĺ��壬���Բο�API�ĵ�
		String str = d3.format(new Date());
		System.out.println("�¸�ʽ��"+str);
		SimpleDateFormat f = new SimpleDateFormat("��Һã������� " + "yyyy �� MM �� dd �� E HH �� mm �� ss ��");
        System.out.println(f.format(date)); // ����ǰʱ����ʽ��Ϊָ���ĸ�ʽ


	}
}
