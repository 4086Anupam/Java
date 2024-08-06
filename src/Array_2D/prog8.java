package Array_2D;

import java.util.Arrays;

public class prog8 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int data = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i % 2 == 0 && j%2==0) {
                    arr[i][j] = 0;

                }
                else {
                    arr[i][j]=data;
                    data+=100;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}