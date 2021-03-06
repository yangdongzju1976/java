import javax.swing.*;//JPanel
import java.awt.*;//颜色，图形、画笔 Graphics
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
/*
KeyAdapter类是一个抽象类（适配器）用于接收键盘事件。这个类的所有方法都是空的。这个类是方便的类创建侦听器对象。
//在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。
*/
import java.awt.event.KeyEvent;
import java.util.Random;
public class GamePanel extends JPanel{
	

	


	public GamePanel(){// 类的构造器 。生成对象的时候自动运行。
		//初始化变量
		
		//将整个屏幕的焦点放在面板上。
		this.setFocusable(true);
		

		

	}
	


	
	@Override 
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			this.setBackground(new Color(179,231,240));//RGB三元色的值.画矩形后覆盖
			
			//设置画笔颜色
			g.setColor(Color.red);
			//绘制40条横线（起点横坐标，起点纵坐标，终点横坐标，终点纵坐标）
			//for (int i=3;i<=32 ;i++ )
				//	g.drawLine(25,25*i,775,25*i);
			//绘制40条竖线
			//for (int i=1; i<=31;i++ )
			//	g.drawLine(25*i,75,25*i,750);
			
			/*                                                                               */
	int i,j,k,t,p,m,n;
	n=22;
	//输出第一行
	
	g.drawString("\n		",100,100); //第一行的前导空格
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




			/*                                                                               */
			g.setColor(Color.red);
			//g.fillRect(100,100,15,15);
			
			g.setFont(new Font("宋体",Font.BOLD,30));//设置字体
			//g.drawString("*", 100, 100);
			//repaint();
}
}
	

