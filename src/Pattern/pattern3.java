package Pattern;

public class pattern3 {
    public static void main(String[] args) {

       int num=5;
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                if (i==0||i==(num-1)){
                    System.out.print("*");
                }
                else {
                    int star=(num-i-1);
                    if(j==star){
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }


}
