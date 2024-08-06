package Pattern;

public class pattern4 {


    public static void main(String[] args) {

        int num= 5;

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if (i==0||i==(num-1)||j==(num-i-1)){
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
