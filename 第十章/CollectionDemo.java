import java.util.ArrayList; // ���� ArrayList ��
import java.util.Iterator; // ���� Iterator ��
public class CollectionDemo
{
	public static void main(String[] args){
		ArrayList list = new ArrayList(); //��������û��ָ��String����
		method(list);
		//ͨ��������ȡ������
		Iterator it = list.iterator();
		while (it.hasNext())
		{
			String str = (String)it.next();//ǿ������ת��
			System.out.println(str);    //Integer.toString(i);
		}
		//ֱ�ӷ���
		System.out.println("\nֱ�ӷ��ʣ�"+list.get(1)); 
		//�޸�Ԫ��
		list.set(2, "������");
		System.out.println("\n�����޸ĺ��Ԫ�أ�"+list.get(2)); 
		//ɾ��Ԫ��
		list.remove(2); 
		//�����������
		System.out.println("\n��������"+list);
		//Ԫ�ظ���
		System.out.println("\nԪ�ظ�����"+list.size());
		//ͨ��ѭ��������������
		
		System.out.println("\nͨ��ѭ�������������飺\n");
		for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
	}
	}
	public static void method(ArrayList list){
		//�������
		list.add("����");
		list.add("�ŷ�");
		list.add("����");
		list.add("����");
		list.add("��");
	    list.add(123);
		}
}
/*
ArrayList ����һ�����Զ�̬�޸ĵ����飬����ͨ����������������û�й̶���С�����ƣ�
���ǿ�����ӻ�ɾ��Ԫ�ء�
ArrayList �̳��� AbstractList ����ʵ���� List �ӿڡ�

������ it ���������������� next ��hasNext �� remove��
���� it.next() �᷵�ص���������һ��Ԫ�أ����Ҹ��µ�������״̬��
���� it.hasNext() ���ڼ�⼯�����Ƿ���Ԫ�ء�
���� it.remove() �����������ص�Ԫ��ɾ����

�������ظ��������̵Ļ����Ŀ��ͨ����Ϊ�˱ƽ�����Ŀ�������
ÿһ�ζԹ��̵��ظ���Ϊһ�Ρ�����������ÿһ�ε����õ��Ľ��
����Ϊ��һ�ε����ĳ�ʼֵ��
*/