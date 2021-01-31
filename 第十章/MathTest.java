public class MathTest {
 
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(2.0, 3.0));
    }
 
    private static <T extends Comparable> T max(T t1, T t2) {
        return t1.compareTo(t2) > 0 ? t1 : t2;
    }
}
/*
Comparable接口简介.
Comparable 接口内部只有1个要重写的关键的方法.

就是

int compareTo(T o)

compareTo() 方法用于将 Number 对象与方法的参数进行比较。可用于比较 Byte, Long, Integer等。

该方法用于两个相同数据类型的比较，两个不同类型的数据不能用此方法来比较
*/