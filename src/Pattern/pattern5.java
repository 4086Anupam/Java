package Pattern;

public class pattern5 {


    public static void main(String[] args) {

       int num=5;
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                if (j==(num-j-1) || j==(num-i-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

}
