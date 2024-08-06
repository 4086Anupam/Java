package Array_2D;

public class prog4 {

    public static void main(String[] args) {


       int a[][] =new int [3][2];

       a[0][0]=10;
       a[0][1]=20;
       a[1][0]=30;
       a[1][1]=40;
       a[2][0]=50;
       a[2][1]=60;


       ///    Enhanced formet

       for(int var[] :a){
           for(int v:var){

               System.out.print(v+" ");
           }
           System.out.println();
       }

    /// Basic formet

        for (int i = 0; i <=2 ; i++) {
            for (int j = 0; j <=1 ; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

    }


}
