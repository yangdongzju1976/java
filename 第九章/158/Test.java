import java.io.*;
import java.util.*;
//�Զ����쳣��ʹ��
class ChooseOutOfBoundsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ChooseOutOfBoundsException(String message) {
        super(message);
    }

}


public class Test {

    public static void main(String[] args) {
        System.out.println("����������ѡ��1-7����");
        int n = getChoose();
        System.out.println(n);
    }

    public static int getChoose() {
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        if(choose > 7 || choose < 1) {
            ChooseOutOfBoundsException e = new ChooseOutOfBoundsException("��ѡ������ֳ����˷�Χ[1,7]");
            throw e;
        }
        return choose;
    }
}

