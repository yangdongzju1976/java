public class NineNine{

    public static void main(String[]args){

    System.out.println();

    for (int j=1;j<10;j++){

        for(int k=1;k<10;k++) {   //�ж������� k<=j��ʡȥ���е�if��䡣

            if (k>j) break;       //�˴��� continueҲ���ԣ�ֻ��Ч�ʵ�һ��

            System.out.print(" "+k+"*"+j+"="+j*k);

         }

        System.out.println();

        }

    }

}
//9*9�˷���