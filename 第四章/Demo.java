import java.util.Scanner; 
 
public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("next方式接收：");
        while (scan.hasNext())
        {
		//	System.out.println("打印键盘输入内容"+scan.next());
        }
        scan.close();
    }
}