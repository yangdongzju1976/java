//equals()�������ж϶����Ƿ����
import java.util.Scanner;
public class Test01 {
    // ��֤�û���������
    public static boolean validateLogin(String uname, String upwd) {
        boolean con = false;
        if (uname.equals("admin") && upwd.equals("admin")) { // �Ƚ����� String ����
            con = true;
        } else {
            con = false;
        }
        return con;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------��ӭʹ�ô����ݹ���ƽ̨------");
        System.out.println("�û�����");
        String username = input.next(); // ��ȡ�û�������û���
        System.out.println("���룺");
        String pwd = input.next(); // ��ȡ�û����������
        boolean con = validateLogin(username, pwd);
        if (con) {
            System.out.println("��¼�ɹ���");
        } else {
            System.out.println("�û�������������");
        }
    }
}