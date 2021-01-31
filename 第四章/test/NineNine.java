public class NineNine{

    public static void main(String[]args){

    System.out.println();

    for (int j=1;j<10;j++){

        for(int k=1;k<10;k++) {   //判断语句里的 k<=j，省去下列的if语句。

            if (k>j) break;       //此处用 continue也可以，只是效率低一点

            System.out.print(" "+k+"*"+j+"="+j*k);

         }

        System.out.println();

        }

    }

}
//9*9乘法表