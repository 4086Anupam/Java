package Exception_Handeling;

import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number ");

        int num1 = sc.nextInt();
        int num2=sc.nextInt();

    try{

        int result = num1/num2 ;

    }catch (ArithmeticException e){

        System.out.println("Error...");

    }finally {

        System.out.println("I dont care thr exception ");



    }

        System.out.println("Application Successfully ");

    }




}
