import java.util.*;
/*
  1.ArrayList���Ǵ�˵�еĶ�̬����
  2.ʵ����ICollection��List�ӿ�
  3.������������Ĵ�С
  4.�����Ǿ�̬�ģ����鱻��ʼ��֮�����鳤�ȾͲ����ٸı��ˡ�ArrayList�ǿ��Զ�̬�ı��С�ġ�
  5.ʲôʱ��ʹ��Array�����飩��ʲôʱ��ʹ��ArrayList?
	���ǣ������ǲ�֪�������ж��ٸ�����Ԫ�ص�ʱ�򣬾Ϳ�ʹ��ArrayList��
	���֪�����ݼ����ж��ٸ�Ԫ�أ��������顣
  6.Arraylist()����������췽��������һ���յ�����
  7.ArrayList(Collection<? extends E> c)����
	������췽��������һ������ָ��Ԫ�ؼ��ϵ�����ע�⣬������ַ�E��һ����ǣ�
	������ʾ������Ԫ�ص����͡����ھ�����ʲô���ͣ���Ҫ����ʹ��������췽����ʱ����ָ����
  8.ArrayList��ֻ֧�ֶ������ͣ���֧�� �����������͡�����˵ArrayList����ֻ�ܴ�Ŷ��󣬲��ܴ�Ż����������͵����ݡ�
*/
public class test
{
	public static void main(String[] args) {
    ArrayList <String>list1 = new ArrayList<>(); // �������� list1 ����һ���յ����������������String���͵Ķ���
    ArrayList <String> list2 = new ArrayList<>(); // �������� list2
	/*
	����һ��ָ����ʼ���������������������������������
����ArrayList<Integer> list = new ArrayList<Integer>(7);
	*/
    list1.add("one"); // �� list1 ���һ��Ԫ��
    list1.add("two"); // �� list1 ���һ��Ԫ��
	list1.add(0,"zero");//��ָ��λ�ò���Ԫ��
    list2.addAll(list1); // �� list1 ������Ԫ����ӵ� list2
    list2.add("three"); // �� list2 ���һ��Ԫ��
    System.out.println("list2 �����е�Ԫ�����£�");
   Iterator it1 = list2.iterator();
   System.out.print(it1.next());
    while (it1.hasNext()) {
        System.out.print("��"+it1.next()  );
    }
	System.out.println("\n\n");
	
}
}
