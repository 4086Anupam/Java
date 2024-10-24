package OOPS.Inheritance;

import java.util.Scanner;

class Calcutater {


    int sum(int n1,int n2){
        return n1+n2;

    }

    int sub (int n1,int n2){

      return n1-n2;

    }


}

class AdvanceCalculater extends Calcutater{

    int multi(int n1,int n2){
        return n1*n2;
    }
     int divided(int n1,int n2){
        return n1/n2;
     }
}

class  User {
    public static void main(String[] args) {

        AdvanceCalculater obj=new AdvanceCalculater();
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your number ");
       int n1= sc.nextInt();
       int n2 =sc.nextInt();
       int sum = obj.sum(n1,n2);
       int sub =obj.sub(n1,n2);
       int multi = obj.multi(n1,n2);
       int divided =obj.divided(n1,n2);
        System.out.println(" Sum number is " + sum);
        System.out.println(" Sub number is " +sub);
        System.out.println(" Multiplication number is " + multi);
        System.out.println(" Divided number is " + divided);


    }
}