/*
�����ж��徲̬�����ԣ���Ա���������� main() �����п���ֱ�ӷ��ʣ�Ҳ����ͨ���������ʣ�������ͨ�����ʵ�����������ʡ�

ע�⣺��̬�����Ǳ����ʵ��������ġ�
*/
public class StaticVar {
    public static String str1 = "Hello";
    public static void main(String[] args) {
        String str2 = "World!";
        // ֱ�ӷ���str1
        String accessVar1 = str1+str2;
        System.out.println("�� 1 �η��ʾ�̬���������Ϊ��"+accessVar1);
        // ͨ����������str1
        String accessVar2 = StaticVar.str1+str2;
        System.out.println("�� 2 �η��ʾ�̬���������Ϊ��"+accessVar2);
        // ͨ������svt1����str1
        StaticVar svt1 = new StaticVar();
        svt1.str1 = svt1.str1+str2;
        String accessVar3 = svt1.str1;
        System.out.println("��3�η���̬���������Ϊ��"+accessVar3);
        // ͨ������svt2����str1
        StaticVar svt2 = new StaticVar();
        String accessVar4 = svt2.str1+str2;
        System.out.println("�� 4 �η��ʾ�̬���������Ϊ��"+accessVar4);
		System.out.println("�� 4 �η��ʾ�̬���������Ϊ��"+str1);
    }
}