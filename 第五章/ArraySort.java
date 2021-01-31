import java.util.Arrays;
public class ArraySort
{	
	public static void main(String[] args) 
	{   ArraySort b=new ArraySort();//???????????????????Output?????????static
		char a[]={'d','c','b','f','e'};
		System.out.println("?????");
		b.Output(a);
		System.out.println();//????
		Arrays.sort(a);
		System.out.println("?????");
		b.Output(a);
		System.out.println("\n\n\n");

	}
	 void Output(char b[]){
		for (int i=0;i<b.length ;i++ )
		{
			System.out.print("a["+i+"]="+b[i]+"\t");
		}
		
	}

}
