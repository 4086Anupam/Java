package Array_2D;

public class prog1 {

    public static void main (String[] args){

        int arr[][]={
                {5,6,4},{8,5,2},{7,4,1}
        };


        // Enhanced for loop for 2D array :-

            // for (data_type variable :array_name){

        //                      for (data_type variable :array_name){
        //                               body of the loop }
        //                               // }






        for(int var[]:arr){
            for(int var1:var){

                System.out.print(var1 +" ");
            }
            System.out.println();
        }



    }




}
