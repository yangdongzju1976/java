import java.util.Random;//java.util.Random��������һ���������������Ҳ����õ�һ�֣����캯����������Random()��Random(long seed)����һ�������Ե�ǰʱ��ΪĬ�����ӣ��ڶ�������ָ��������ֵ���С�
public class ForTest{
	public static void main(String args[]){
	Random r=new Random();//�Ե�ǰʱ��ΪĬ������ ,�ı�ɹ̶����ӣ������Random(1)
	int a[][]=new int[10][10];//����һ�����顣java�ĸ�ʽ��
	int i,j,ran;
	for (i=0;i<a.length ;i++ )  //a.length:10 ����
		for (j=0;j<a[i].length ;j++ ) //a[i].length :10 ����
		{
			a[i][j]=r.nextInt(100); //100,������ķ�Χ���ı�һ�����ֵ���������
		}
	
	System.out.println("10��10�е��������Ϊ��");
	for (i=0;i<a.length ;i++ )
		{
		for (j=0;j<a[i].length ;j++ )
		{
			System.out.print("\t"+a[i][j]);//print :��ͬһ����������һ�С�
		}
		System.out.println();//����
		}
		
	}
	
	
}
