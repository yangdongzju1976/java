import java.util.Scanner;  //Scanner是一个类。我们可以通过 Scanner 类来获取用户的输入。
public class ScannerTest
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in); //生成Scanner类的实例input. Scanner.in读取标准输入设备数据（从标准输入设备获取数据，一般是键盘）
		int score;
		float f;
		//System.out.print("输入值：\nscore=");
		//score=input.nextInt();  //从键盘获得输入，如果输入的不是整数，则报错。nextInt()只接受整数
		//System.out.println("输出：\nscore = "+score);
		//----------------------------------------------------
		 /*if (input.hasNextInt()) {//如果输入的值是整数则为真，否则为假。
            String str1 = input.next();//nextInt(),nextFloat只能接收整型，浮点型。
            System.out.println("输入的数据为：" + str1);
        }*/
		if (input.hasNextFloat()) {
            // 判断输入的是否是小数
            f = input.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
		
		if (input.hasNextLine()) {
            String str2 = input.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        while (input.hasNextInt())
        {
			System.out.println("打印键盘输入内容"+input.next());
        }
        input.close();

	}
}
/*
一、next()与nextLine()区别
next():nextInt() nextfloat()

1.一定要读取到有效字符后才可以结束输入。
2.对输入有效字符之前遇到的空白，next()方法会自动将其去掉。
3.只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
next()不能得到带有空格的字符串。
nextLine()：

1.以Enter为结束符,也就是说nextLine()方法返回的是输入回车之前的所有字符。
2.可以获得空白。

二、Scanner.close()的必要性
使用Scanner（system.in）时，使用完毕后，一定要关闭扫描器，因为system.in属于IO流，一旦打开，它一直在占用资源，
因此使用完毕后切记要关闭。

三、基本用法

1.查看类并导入类
//该类需要import导入后使用
import java.util.Scanner；

2. 查看构造方法
// 构造一个新的Scanner，它生成的值是从指定的输入流扫描来的
public Scanner（InputStream source）；

3. 创建对象
Scanner scan = new Scanner(System.in);

4. Scanner类的基本方法
通过 Scanner 类的 next() 与 nextLine() 方法可以获取输入的字符串，在读取前一般需要使用 hasNext() 与 hasNextLine() 
判断是否还有输入的数据。
*/