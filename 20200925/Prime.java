public class Prime {

     public static void main(String[] args) {
         Prime prime=new Prime();//生成对象
		 int j=-1;
		 //输出100以内的素数
		  System.out.println("200以内的素数：");
         for (int i=2;i<200;i++){
			 if(prime.IsPrime(i))
             {
				 System.out.print(i+"\t");
				 j++;
				  if ((j+1)%11==0)
				System.out.println("");
			 }
			
		 }
		 System.out.println("");
		 System.out.println("");
        
    }

    boolean IsPrime(int p){ //判断是否为素数。
        int i;
        for(i=2;i<=Math.sqrt(p);i++) 
            if(p%i==0)
            return false;

            return true;
    }
    
}
//java.lang.Math.sqrt(p)