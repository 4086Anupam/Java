package Exception_Handeling;

public class Exceptionthrow1 {

   static  public void withdraw(int amount) {
        int balance = 500;
        if (amount > balance) {

            throw new ArithmeticException("Do not sufficient balance ");

        }
        else {
            System.out.println("This amount is "+amount);
        }
    }



    public static void main(String[] args) {

        try {
            withdraw(800);
        }catch (ArithmeticException e){

            System.out.println(e.getMessage());
        }


    }






}
