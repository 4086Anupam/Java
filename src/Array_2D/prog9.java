package Array_2D;

import java.util.Arrays;

public class prog9 {


    public static void main(String[] args) {


        int[][] arr = new int[3][3];
        int data = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (j==0) {
                    arr[i][j] = data;
                }
                else if (j==1) {
               data +=100;
               arr[i][j]=data;
                }
                else {
               data=data+arr[i][j-2];
               arr[i][j]=data;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }



}



