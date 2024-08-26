package Pattern;

public class pattern9 {

    public static void main(String[] args) {

        int num=15;
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                if (i==j||j==num-i-1){
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
