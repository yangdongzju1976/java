/*
�ڷ��ʷǾ�̬����ʱ����Ҫͨ��ʵ�����������ʣ����ڷ��ʾ�̬����ʱ������ֱ�ӷ��ʣ�Ҳ����ͨ�����������ʣ�
������ͨ��ʵ�������������ʡ�
*/

public class StaticMethod {
    public static int count = 1;    // ���徲̬����count
	//count++;
    public int method1() {    
        // ʵ������method1
        count++;    // ���ʾ�̬����count����ֵ
        System.out.println("�ھ�̬���� method1()�е� count="+count);    // ��ӡcount
        return count;
    }
    public static int method2() {    
        // ��̬����method2
        count += count;    // ���ʾ�̬����count����ֵ
        System.out.println("�ھ�̬���� method2()�е� count="+count);    // ��ӡcount
        return count;
    }
    public static void PrintCount() {    
        // ��̬����PrintCount
        count += 2;
        System.out.println("�ھ�̬���� PrintCount()�е� count="+count);    // ��ӡcount
    }
    public static void main(String[] args) {
        StaticMethod sft = new StaticMethod();
        // ͨ��ʵ���������ʵ������
        System.out.println("method1() ��������ֵ intro1="+sft.method1());
        // ֱ�ӵ��þ�̬����
        System.out.println("method2() ��������ֵ intro1="+method2());
        // ͨ���������þ�̬��������ӡ count
        StaticMethod.PrintCount();
    }
}
