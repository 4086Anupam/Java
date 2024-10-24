package if_else_if;

import java.util.Scanner;

public class prog7 {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int number = sc.nextInt();

        if (number%4==0){

            System.out.println("Leap year");
        }
        else {

            System.out.println("Not leap year");
        }




    }


}
