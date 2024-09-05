package Pattern;

public class pattern12 {

    public static void main(String[] args) {
        int n = 5;
        int i;
        for (i = 0; i < n; i++) {

            for (int j = 0; j <= n; j++) {
                {
                    if (j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }


            }
            System.out.println();
        }
    }
}





