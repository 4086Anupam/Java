package Exception_Handeling;

public class Exceptionthrow {




    static public void eligiblevote(int age ) {

        if (age < 18) {
            throw new ArithmeticException("This person not eligible for vote");

        } else {

            System.out.println("This person is eligible ");


        }
    }


            public static void main(String[] args)

            {

                try {
                    eligiblevote( 15);
                } catch (ArithmeticException e) {

                    System.out.println(e.getMessage());

                }


            }


        }









