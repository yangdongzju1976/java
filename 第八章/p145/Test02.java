public class Test02 {
    public static void printClassInfo(Object obj) {
        // ��ȡ����
        System.out.println("������" + obj.getClass().getName());
        // ��ȡ������
        System.out.println("���ࣺ" + obj.getClass().getSuperclass().getName());
        System.out.println("ʵ�ֵĽӿ��У�");
        // ��ȡʵ�ֵĽӿڲ����
        for (int i = 0; i < obj.getClass().getInterfaces().length; i++) {
            System.out.println(obj.getClass().getInterfaces()[i]);
        }
    }
    public static void main(String[] args) {
        String strObj = new String();
        printClassInfo(strObj);
    }
}