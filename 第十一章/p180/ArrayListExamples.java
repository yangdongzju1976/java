import java.util.*;

public class ArrayListExamples {

    public static void main(String args[]) {
        // ����һ���յ������������list��list�������String���͵�����
       // ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();

        // ����Ԫ�ص�list������
        list.add("�ν�");
        list.add("¬����");
        list.add(2, "����"); // ������佫��ѡ�Item3���ַ������ӵ�list�ĵ�3��λ�á�
        list.add("����ʤ");

        // ��ʾ���������е�����
        System.out.println("����list��������Ԫ��: "
                + list);

        // ���Ԫ�ص�λ��
        int pos = list.indexOf("¬����");
        System.out.println("¬�����������е�λ����: " + pos);

        // ������������Ƿ�Ϊ��
        boolean check = list.isEmpty();
        System.out.println("��������Ƿ�Ϊ��: " + check);

        // ��ȡ����Ĵ�С
        int size = list.size();
        System.out.println("����Ĵ�СΪ��Ԫ�ظ�����: " + size);

        // ��������������Ƿ����ĳԪ��
        boolean element = list.contains("��ʤ");
        System.out
                .println(" ��ʤ�Ƿ���list������: "
                        + element);

        // ��ȡָ��λ���ϵ�Ԫ��
        String item = list.get(0);
        System.out.println("���Ϊ 0 ��Ԫ��Ϊ: " + item);

        // ����arraylist�е�Ԫ��

        // ��1�ַ���: ѭ��ʹ��Ԫ�ص�����������Ĵ�С
        System.out
                .println("ʹ��ѭ����������������������");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("����: " + i + " - �ú�: " + list.get(i));
        }

        // ��2�ַ���:ʹ��foreachѭ��
        System.out.println("ʹ��foreach loop����ѭ��");
        for (String str : list) {
            System.out.println("�ú���: " + str);
			str="����";
        }
		System.out.println("\nʹ��foreachѭ������֮��Ԫ�طֱ�Ϊ��"+list);

        // �����ַ���:ʹ�õ�����
        // hasNext(): ����true��ʾ���������л���Ԫ��
        // next(): ������һ��Ԫ��
        System.out.println("ʹ�õ���������");
       /* for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println("�ú���: " + it.next());
        }*/
		Iterator<String> it = list.iterator();//ʵ��������
		int t=1;
		while(it.hasNext())
		{
			System.out.println("��"+t+"���ú���: " + it.next());
			t++;
		}
	

        // �滻Ԫ��
        list.set(1, "�ֳ�");
        System.out.println("���ֳ��滻�������Ϊ: " + list);

        // �Ƴ�Ԫ��
        // �Ƴ���0��λ���ϵ�Ԫ��
        list.remove(0);

        // �Ƴ���һ���ҵ��� "Item3"Ԫ��
        list.remove("����");

        System.out.println("�Ƴ��ν������ú������Ϊ: " + list);

        // ת�� ArrayList Ϊ Array
        String[] simpleArray = list.toArray(new String[list.size()]);
        System.out.println("ת��ArrayListΪArray: "
                        + Arrays.toString(simpleArray));
    }
}