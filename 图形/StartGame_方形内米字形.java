//import javax.swing.*;//JFrame��JPanel  Swing ��һ��ΪJava��Ƶ�GUI���߰���Swing��JAVA�������һ����.Swing������ͼ���û����棨GUI�������磺�ı��򣬰�ť���ָ�����ͱ�
//import java.awt.*;//Graphics;�����û�����ͻ���ͼ��ͼ������з��ࡣ��AWT�����У����簴ť�������֮����û���������Ϊ�����Component�������� AWT ����ĸ���
import java.util.Scanner;
public class StartGame{
	public static void main(String[] args){

		int i,j,k,t,p,m,n;
		Scanner sc = new Scanner(System.in); 
		System.out.println("������n��ֵ��");
		n=sc.nextInt();
	//�����һ��
	
	System.out.print("\n		"); //��һ�е�ǰ���ո�
	if (n%2==0)  //ż����
	{
		//�ϰ벿��
			//�����һ��
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
			//����м����
			
			for (i=1;i<n/2 ;i++ )
			{
				System.out.print("		*");//ǰ���ո����1����
				for (j=1;j<i;j++ )  //�ո�1��
				{
					System.out.print(" ");
				}
				System.out.print("*");		//��2����
				
				   //�м�ո�2��
				
				for (t=0;t<n/2-i-1 ; t++) //�м�ո�2��--1
				{
					System.out.print(" ");
				}
				System.out.print("*");//��2����


				for (t=0;t<n/2-i-1 ; t++) //�м�ո�2��--1
				{
					System.out.print(" ");
				}

				/*for (t=0; t<=n-2*(i+1);t++ )
					{
						System.out.print(" ");
					}
				*/
				System.out.print("*");//�����ڶ�����
				
				for (k=1;k<i;k++ )  //�ո�
				{
					System.out.print(" ");
				}
				System.out.print("*\n");     //���һ���Ǽӻ���
				


			}
			//������һ��
			System.out.print("		");//ǰ���ո�
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
		//�°벿��
		//��һ��ʡ��
		//����м����
		
		for (i=1;i<n/2 ;i++ )  //�°벿�ֹ�n/2-1��
		{
			System.out.print("		*");//ÿ�е�ǰ���ո����1����
			for (j=1;j<n/2-i;j++ )  //�ո�1
			{
				System.out.print(" ");
			}
			System.out.print("*");		//��2����
			
				//�м�����ߺͿո�
			for (t=1;t<i ;t++ ) //�ո�2
			{
				System.out.print(" ");

			}
			System.out.print("*"); //��3����
			for (t=1;t<i ;t++ ) //�ո�3
			{
				System.out.print(" ");

			}
			
			
			System.out.print("*");  //��3����
			
			for (k=1;k<n/2-i;k++ )  //�ո�4
			{
				System.out.print(" ");
			}
			System.out.print("*\n");     //��4���ǣ����һ���ǣ��ӻ���
			
		}
		//������һ��
		System.out.print("		");//ǰ���ո�
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
	else  //������
	{	
		//�ϰ벿��
			//�����һ��
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
			//����м����
			
			for (i=1;i<n/2 ;i++ )
			{
				System.out.print("		*");//ǰ���ո����1����
				for (j=1;j<i;j++ )  //�ո�1��
				{
					System.out.print(" ");
				}
				System.out.print("*");		//��2����
				
				   //�м�ո�2��
				
				for (t=0;t<n/2-i-1 ; t++) //�м�ո�2��--1
				{
					System.out.print(" ");
				}
				System.out.print("*");//��2����


				for (t=0;t<n/2-i-1 ; t++) //�м�ո�2��--1
				{
					System.out.print(" ");
				}

				/*for (t=0; t<=n-2*(i+1);t++ )
					{
						System.out.print(" ");
					}
				*/
				System.out.print("*");//�����ڶ�����
				
				for (k=1;k<i;k++ )  //�ո�
				{
					System.out.print(" ");
				}
				System.out.print("*\n");     //���һ���Ǽӻ���
				


			}
			//������һ��
			System.out.print("		");//ǰ���ո�
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
		//�°벿��
		//��һ��ʡ��
		//����м����
		
		for (i=1;i<n/2 ;i++ )  //�°벿�ֹ�n/2-1��
		{
			System.out.print("		*");//ÿ�е�ǰ���ո����1����
			for (j=1;j<n/2-i;j++ )  //�ո�1
			{
				System.out.print(" ");
			}
			System.out.print("*");		//��2����
			
				//�м�����ߺͿո�
			for (t=1;t<i ;t++ ) //�ո�2
			{
				System.out.print(" ");

			}
			System.out.print("*"); //��3����
			for (t=1;t<i ;t++ ) //�ո�3
			{
				System.out.print(" ");

			}
			
			
			System.out.print("*");  //��3����
			
			for (k=1;k<n/2-i;k++ )  //�ո�4
			{
				System.out.print(" ");
			}
			System.out.print("*\n");     //��4���ǣ����һ���ǣ��ӻ���
			
		}
		//������һ��
		System.out.print("		");//ǰ���ո�
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
