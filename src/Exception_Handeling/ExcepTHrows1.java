package Exception_Handeling;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import static Exception_Handeling.ExcepTHrows1.m;
import static java.lang.Long.sum;

public class ExcepTHrows1 {



   static  public int Sum(int a,  int b){

        int result1=a+b;


        return result1;
    }

    static  public int sub(int a, int b){

        int result2=a-b;
        return result2;

    }

  static   public  void m(int a, int b){

       sum(a,b);
        sub(a,b);


    }



}

class TEXT{

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number");

        int a= sc.nextInt();
        int b=sc.nextInt();


        try {

            m(a,b);

        }catch (ArithmeticException e){

            System.out.println("Something Wrong ");

        }
        int result1 = 0;
        int result2 = 0;
        System.out.println(result1);
        System.out.println(result2);
    }



}
