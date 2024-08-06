package Array_2D;

import java.util.Arrays;
import java.util.stream.Collectors;

public class prog5 {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        int data = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = data;
                data+=100;
            }

        }

        System.out.println(Arrays.deepToString(arr));
    }
}
