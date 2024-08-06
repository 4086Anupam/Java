package Control_statements;

import java.util.Scanner;

public class if_else6 {


    public static void main(String[] args) {

        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year %4==0 && year %100 ==0)
            System.out.println("Leap year");
        else
            System.out.println("Leap year");

    }
}
