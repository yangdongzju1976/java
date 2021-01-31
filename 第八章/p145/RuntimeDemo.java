public class RuntimeDemo
{
	public static void main(String[] args) 
	{
		//获取Runtime对象。
		Runtime run=Runtime.getRuntime();
		System.out.println("总内存大小："+run.totalMemory());
		System.out.println("处理器数量："+run.availableProcessors());
		
	}
}
//应用程序不能直接对Runtime类进行实例化，但可以通过getRuntime()方法获取与该
//程序关联的Runtime对象。这个对象就代表了当前运行程序的运行时环境。通过该对象
//可以访问JVM的相关信息，如处理器数量，内存信息等。
