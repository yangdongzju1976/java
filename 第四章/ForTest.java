import java.util.Random;//java.util.Random类来产生一个随机数发生器，也是最常用的一种，构造函数有两个，Random()和Random(long seed)。第一个就是以当前时间为默认种子，第二个是以指定的种子值进行。
public class ForTest{
	public static void main(String args[]){
	Random r=new Random();//以当前时间为默认种子 ,改变成固定种子，看结果Random(1)
	int a[][]=new int[10][10];//定义一个数组。java的格式。
	int i,j,ran;
	for (i=0;i<a.length ;i++ )  //a.length:10 行数
		for (j=0;j<a[i].length ;j++ ) //a[i].length :10 列数
		{
			a[i][j]=r.nextInt(100); //100,随机数的范围。改变一下这个值，看结果。
		}
	
	System.out.println("10行10列的随机数组为：");
	for (i=0;i<a.length ;i++ )
		{
		for (j=0;j<a[i].length ;j++ )
		{
			System.out.print("\t"+a[i][j]);//print :在同一行输出数组的一行。
		}
		System.out.println();//换行
		}
		
	}
	
	
}
