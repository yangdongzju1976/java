public class Prime {

     public static void main(String[] args) {
         Prime prime=new Prime();//���ɶ���
		 int j=-1;
		 //���100���ڵ�����
		  System.out.println("200���ڵ�������");
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

    boolean IsPrime(int p){ //�ж��Ƿ�Ϊ������
        int i;
        for(i=2;i<=Math.sqrt(p);i++) 
            if(p%i==0)
            return false;

            return true;
    }
    
}
//java.lang.Math.sqrt(p)