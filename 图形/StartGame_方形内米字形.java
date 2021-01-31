//import javax.swing.*;//JFrame、JPanel  Swing 是一个为Java设计的GUI工具包。Swing是JAVA基础类的一部分.Swing包括了图形用户界面（GUI）器件如：文本框，按钮，分隔窗格和表。
//import java.awt.*;//Graphics;创建用户界面和绘制图形图像的所有分类。在AWT术语中，诸如按钮或滚动条之类的用户界面对象称为组件。Component类是所有 AWT 组件的根。
import java.util.Scanner;
public class StartGame{
	public static void main(String[] args){

		int i,j,k,t,p,m,n;
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入n的值：");
		n=sc.nextInt();
	//输出第一行
	
	System.out.print("\n		"); //第一行的前导空格
	if (n%2==0)  //偶数行
	{
		//上半部分
			//输出第一行
			for (i=0;i<=n ;i++ )
			{
				if (i%2==0)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.print("\n");
			//输出中间的行
			
			for (i=1;i<n/2 ;i++ )
			{
				System.out.print("		*");//前导空格与第1颗星
				for (j=1;j<i;j++ )  //空格（1）
				{
					System.out.print(" ");
				}
				System.out.print("*");		//第2颗星
				
				   //中间空格（2）
				
				for (t=0;t<n/2-i-1 ; t++) //中间空格（2）--1
				{
					System.out.print(" ");
				}
				System.out.print("*");//第2颗星


				for (t=0;t<n/2-i-1 ; t++) //中间空格（2）--1
				{
					System.out.print(" ");
				}

				/*for (t=0; t<=n-2*(i+1);t++ )
					{
						System.out.print(" ");
					}
				*/
				System.out.print("*");//倒数第二颗星
				
				for (k=1;k<i;k++ )  //空格
				{
					System.out.print(" ");
				}
				System.out.print("*\n");     //最后一颗星加换行
				


			}
			//输出最后一行
			System.out.print("		");//前导空格
			for (i=0;i<=n ;i++ )
			{
				if (i==n/2||i%2==0) //i%2==0||
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
		/******************************************************************************************/
		//下半部分
		//第一行省略
		//输出中间的行
		
		for (i=1;i<n/2 ;i++ )  //下半部分共n/2-1行
		{
			System.out.print("		*");//每行的前导空格与第1颗星
			for (j=1;j<n/2-i;j++ )  //空格1
			{
				System.out.print(" ");
			}
			System.out.print("*");		//第2颗星
			
				//中间的竖线和空格
			for (t=1;t<i ;t++ ) //空格2
			{
				System.out.print(" ");

			}
			System.out.print("*"); //第3颗星
			for (t=1;t<i ;t++ ) //空格3
			{
				System.out.print(" ");

			}
			
			
			System.out.print("*");  //第3颗星
			
			for (k=1;k<n/2-i;k++ )  //空格4
			{
				System.out.print(" ");
			}
			System.out.print("*\n");     //第4颗星（最后一颗星）加换行
			
		}
		//输出最后一行
		System.out.print("		");//前导空格
		for (i=0;i<=n ;i++ )
		{
			if (i%2==0)
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
		}
		System.out.print("\n");
		
	}
	else  //奇数行
	{	
		//上半部分
			//输出第一行
			for (i=0;i<=n ;i++ )
			{
				if (i%2==0||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.print("\n");
			//输出中间的行
			
			for (i=1;i<n/2 ;i++ )
			{
				System.out.print("		*");//前导空格与第1颗星
				for (j=1;j<i;j++ )  //空格（1）
				{
					System.out.print(" ");
				}
				System.out.print("*");		//第2颗星
				
				   //中间空格（2）
				
				for (t=0;t<n/2-i-1 ; t++) //中间空格（2）--1
				{
					System.out.print(" ");
				}
				System.out.print("*");//第2颗星


				for (t=0;t<n/2-i-1 ; t++) //中间空格（2）--1
				{
					System.out.print(" ");
				}

				/*for (t=0; t<=n-2*(i+1);t++ )
					{
						System.out.print(" ");
					}
				*/
				System.out.print("*");//倒数第二颗星
				
				for (k=1;k<i;k++ )  //空格
				{
					System.out.print(" ");
				}
				System.out.print("*\n");     //最后一颗星加换行
				


			}
			//输出最后一行
			System.out.print("		");//前导空格
			for (i=0;i<=n ;i++ )
			{
				if (i==n/2||i%2==0) //i%2==0||
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
		/******************************************************************************************/
		//下半部分
		//第一行省略
		//输出中间的行
		
		for (i=1;i<n/2 ;i++ )  //下半部分共n/2-1行
		{
			System.out.print("		*");//每行的前导空格与第1颗星
			for (j=1;j<n/2-i;j++ )  //空格1
			{
				System.out.print(" ");
			}
			System.out.print("*");		//第2颗星
			
				//中间的竖线和空格
			for (t=1;t<i ;t++ ) //空格2
			{
				System.out.print(" ");

			}
			System.out.print("*"); //第3颗星
			for (t=1;t<i ;t++ ) //空格3
			{
				System.out.print(" ");

			}
			
			
			System.out.print("*");  //第3颗星
			
			for (k=1;k<n/2-i;k++ )  //空格4
			{
				System.out.print(" ");
			}
			System.out.print("*\n");     //第4颗星（最后一颗星）加换行
			
		}
		//输出最后一行
		System.out.print("		");//前导空格
		for (i=0;i<=n ;i++ )
		{
			if (i%2==0||i==n/2)
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(" ");
			}
			
		}
		System.out.print("\n");
		
	}	
	System.out.print("\n\n\n\n");
	}

}
