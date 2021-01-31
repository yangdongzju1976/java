public class GenericMethodTest
{
   // 泛型方法 printArray 
   /*
   泛型方法，该方法在调用时可以接收不同类型的参数。
   根据传递给泛型方法的参数类型，编译器适当地处理每一个方法调用。
   注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。
   (参数化类型)
   所操作的数据类型被指定为一个参数（type parameter）这种参数类型可以用在类、接口和方法的创建中，分别称为泛型类、泛型接口、泛型方法
   */
   public static < A > void printArray( A[] inputArray )
   {
      // 输出数组元素            
         for ( A element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
		 //用传统输出方式
		 for (int i=0;i<inputArray.length ;i++ )
		 {
			  System.out.printf( "%s ", inputArray[i] );
		 }
    }
 
    public static void main( String args[] )
    {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
 
        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组
 
        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组
 
        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
		System.out.printf("%s",5.8);
    } 
}
/*
原始类型与引用类型
 Java中的原始类型是不同于类的基本数据类型，包括如下8种基本类型：
 double、float、byte、short、int、long、char、boolean。
 这8种 原始类型直接存储在Java的内存栈中，数据本身的值也是存储在栈中，
 即当声明了一个原始类型时，就在栈中为类型本身申请了存储。
 Java为每个原始类型提供了对应的封装类型P38页
 引用类型是一种对象类型,它的值是指向内存空间的引用，就是地址。
 包装类型默认值都为null。
原始类型	 封装类
double	Double
float	Float
byte	Byte
short	Short
int	    Integer
long	Long
char	Character
boolean	Boolean

自动装箱: java自动将原始类型转化为引用类型的过程，自动装箱时编译器会调用valueOf方法,将原始类型转化为对象类型。
自动拆箱: java自动将引用类型转化为原始类型的过程，自动拆箱时编译器会调用intValue(),doubleValue()这类的方法将对象转换成原始类型值。
自动装箱主要发生在两种情况：一种是赋值时，一种是方法调用时。
Integer a = 3; //自动装箱
int b = a; //自动拆箱
*/
