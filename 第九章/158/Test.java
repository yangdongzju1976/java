import java.io.*;
import java.util.*;
//自定义异常的使用
class ChooseOutOfBoundsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ChooseOutOfBoundsException(String message) {
        super(message);
    }

}


public class Test {

    public static void main(String[] args) {
        System.out.println("请输入您的选择（1-7）：");
        int n = getChoose();
        System.out.println(n);
    }

    public static int getChoose() {
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        if(choose > 7 || choose < 1) {
            ChooseOutOfBoundsException e = new ChooseOutOfBoundsException("您选择的数字超出了范围[1,7]");
            throw e;
        }
        return choose;
    }
}

