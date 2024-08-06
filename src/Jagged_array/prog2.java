package Jagged_array;

public class prog2 {


    public static void main(String[] args) {

       int num[][] ={

               {10,20,30},
               {50,40,80,60},
               {10,20}

       };

        for (int var[]:num){

            for (int var1: var){
                System.out.print(var1+" ");
            }
            System.out.println();
        }
    }


}
