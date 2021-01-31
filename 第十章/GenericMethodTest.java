public class GenericMethodTest
{
   // ���ͷ��� printArray 
   /*
   ���ͷ������÷����ڵ���ʱ���Խ��ղ�ͬ���͵Ĳ�����
   ���ݴ��ݸ����ͷ����Ĳ������ͣ��������ʵ��ش���ÿһ���������á�
   ע�����Ͳ���ֻ�ܴ������������ͣ�������ԭʼ���ͣ���int,double,char�ĵȣ���
   (����������)
   ���������������ͱ�ָ��Ϊһ��������type parameter�����ֲ������Ϳ��������ࡢ�ӿںͷ����Ĵ����У��ֱ��Ϊ�����ࡢ���ͽӿڡ����ͷ���
   */
   public static < A > void printArray( A[] inputArray )
   {
      // �������Ԫ��            
         for ( A element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
		 //�ô�ͳ�����ʽ
		 for (int i=0;i<inputArray.length ;i++ )
		 {
			  System.out.printf( "%s ", inputArray[i] );
		 }
    }
 
    public static void main( String args[] )
    {
        // ������ͬ�������飺 Integer, Double �� Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
 
        System.out.println( "��������Ԫ��Ϊ:" );
        printArray( intArray  ); // ����һ����������
 
        System.out.println( "\n˫����������Ԫ��Ϊ:" );
        printArray( doubleArray ); // ����һ��˫����������
 
        System.out.println( "\n�ַ�������Ԫ��Ϊ:" );
        printArray( charArray ); // ����һ���ַ�������
		System.out.printf("%s",5.8);
    } 
}
/*
ԭʼ��������������
 Java�е�ԭʼ�����ǲ�ͬ����Ļ����������ͣ���������8�ֻ������ͣ�
 double��float��byte��short��int��long��char��boolean��
 ��8�� ԭʼ����ֱ�Ӵ洢��Java���ڴ�ջ�У����ݱ����ֵҲ�Ǵ洢��ջ�У�
 ����������һ��ԭʼ����ʱ������ջ��Ϊ���ͱ��������˴洢��
 JavaΪÿ��ԭʼ�����ṩ�˶�Ӧ�ķ�װ����P38ҳ
 ����������һ�ֶ�������,����ֵ��ָ���ڴ�ռ�����ã����ǵ�ַ��
 ��װ����Ĭ��ֵ��Ϊnull��
ԭʼ����	 ��װ��
double	Double
float	Float
byte	Byte
short	Short
int	    Integer
long	Long
char	Character
boolean	Boolean

�Զ�װ��: java�Զ���ԭʼ����ת��Ϊ�������͵Ĺ��̣��Զ�װ��ʱ�����������valueOf����,��ԭʼ����ת��Ϊ�������͡�
�Զ�����: java�Զ�����������ת��Ϊԭʼ���͵Ĺ��̣��Զ�����ʱ�����������intValue(),doubleValue()����ķ���������ת����ԭʼ����ֵ��
�Զ�װ����Ҫ���������������һ���Ǹ�ֵʱ��һ���Ƿ�������ʱ��
Integer a = 3; //�Զ�װ��
int b = a; //�Զ�����
*/
