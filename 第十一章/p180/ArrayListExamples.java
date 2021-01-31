import java.util.*;

public class ArrayListExamples {

    public static void main(String args[]) {
        // 创建一个空的数组链表对象list，list用来存放String类型的数据
       // ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();

        // 增加元素到list对象中
        list.add("宋江");
        list.add("卢俊义");
        list.add(2, "吴用"); // 此条语句将会把“Item3”字符串增加到list的第3个位置。
        list.add("公孙胜");

        // 显示数组链表中的内容
        System.out.println("数组list包含以下元素: "
                + list);

        // 检查元素的位置
        int pos = list.indexOf("卢俊义");
        System.out.println("卢俊义在数组中的位置是: " + pos);

        // 检查数组链表是否为空
        boolean check = list.isEmpty();
        System.out.println("检查数组是否为空: " + check);

        // 获取链表的大小
        int size = list.size();
        System.out.println("数组的大小为（元素个数）: " + size);

        // 检查数组链表中是否包含某元素
        boolean element = list.contains("关胜");
        System.out
                .println(" 关胜是否在list数组中: "
                        + element);

        // 获取指定位置上的元素
        String item = list.get(0);
        System.out.println("序号为 0 的元素为: " + item);

        // 遍历arraylist中的元素

        // 第1种方法: 循环使用元素的索引和链表的大小
        System.out
                .println("使用循环、数组索引来访问数组");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("排名: " + i + " - 好汉: " + list.get(i));
        }

        // 第2种方法:使用foreach循环
        System.out.println("使用foreach loop访问循环");
        for (String str : list) {
            System.out.println("好汉是: " + str);
			str="秦明";
        }
		System.out.println("\n使用foreach循环遍历之后，元素分别为："+list);

        // 第三种方法:使用迭代器
        // hasNext(): 返回true表示链表链表中还有元素
        // next(): 返回下一个元素
        System.out.println("使用迭代器访问");
       /* for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println("好汉是: " + it.next());
        }*/
		Iterator<String> it = list.iterator();//实例化操作
		int t=1;
		while(it.hasNext())
		{
			System.out.println("第"+t+"条好汉是: " + it.next());
			t++;
		}
	

        // 替换元素
        list.set(1, "林冲");
        System.out.println("用林冲替换后的数组为: " + list);

        // 移除元素
        // 移除第0个位置上的元素
        list.remove(0);

        // 移除第一次找到的 "Item3"元素
        list.remove("吴用");

        System.out.println("移除宋江、吴用后的数组为: " + list);

        // 转换 ArrayList 为 Array
        String[] simpleArray = list.toArray(new String[list.size()]);
        System.out.println("转换ArrayList为Array: "
                        + Arrays.toString(simpleArray));
    }
}