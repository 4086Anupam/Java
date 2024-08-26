package Pattern;

public class pattern11 {

    public static void main(String[] args) {

        int num=11;

        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {

               if ( i+j==(num-1)/2 || i-j==(num-1)/2 || j+i==(num-1)/2)  {

                   System.out.print( " *");
               }
               else {

                   System.out.print( " ");
               }


            }
            System.out.println();
        }


    }


}
