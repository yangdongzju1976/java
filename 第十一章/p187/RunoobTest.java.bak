import java.util.LinkedList;
public class RunoobTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
		sites.addFirst("BaiDu");
		sites.addLast("RedMi");

        System.out.println(sites);
		//作为队列使用。pop出队操作
		sites.pop();
		System.out.println(sites);
		//push是压栈操作
		sites.push("HuaWei");
		System.out.println(sites);
		int size=sites.size();
		//遍历
			System.out.println("传统循环遍历");
		for (int i=0;i<size ;i++ )
		{
			System.out.print(sites.get(i)+" ");
		}
		System.out.println("\nforeach遍历");
		for (String s:sites)
		{
			System.out.print(s+" ");
		}

    }
}