package Exception_Handeling;

public class Exceptionthrow2 {

    public static void  booketicket(int age ){

        if (age <18){

          throw  new ArithmeticException("Sorry, you can't enter");

        }
      else {

            System.out.println("you can enter");
        }


    }

    public static void main(String[] args) {

        try {
            booketicket(19);
        }
        catch (ArithmeticException e){

            System.out.println("Error...\n" + e.getMessage());
        }


    }





}
