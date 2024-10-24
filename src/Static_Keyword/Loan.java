package Static_Keyword;

import java.util.Scanner;

public class Loan {


    int principalAmout;
    float timeDuration;
   static float rateInterest;
    float simpleInterest;

    void input(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Plz Enter the amount required ");
        principalAmout= scan.nextInt();
        System.out.println("Plz Enter the time duration");
        timeDuration=scan.nextInt();




    }

   public  void compute(){

        simpleInterest=(principalAmout*timeDuration*rateInterest)/100f;
    }
    public void display(){

        System.out.println("Amout is " + simpleInterest);
    }

    static {

        rateInterest=4.5f;

    }

}


class User {
    public static void main(String[] args) {

       Loan farmer1 = new Loan();
       Loan farmer2 = new Loan();

       farmer1.input();
       farmer2.input();

       farmer1.compute();
       farmer2.compute();

       farmer1.display();
       farmer2.display();
    }
}