package Exception_Handeling;

import java.util.Scanner;

public class Exceptionfinally {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter tne num ");

        int num1 = sc.nextInt();
        int num2=sc.nextInt();

        try {
            int result = num1/num2;
           // System.out.println("This is try block ");
        }
        catch (ArithmeticException e){

            System.out.println("Arithmetic Error....");

        }

        finally {

            System.out.println("This is finally block");


        }

        System.out.println("Application Run successfully ");

    }






}
