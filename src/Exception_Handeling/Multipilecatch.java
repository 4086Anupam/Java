package Exception_Handeling;

public class Multipilecatch {

    public static void main(String[] args) {

       int num1 =  8;

       int num2 =8;

       int array[]= {7,9,2,4};
        int result =0;

        try {
               result = num1/num2;
            System.out.println(array[51]);
        }

        catch (ArithmeticException obj){

            System.out.println("cannot divide by zero");

        }
        catch (ArrayIndexOutOfBoundsException obj){

            System.out.println("Stay in your limit ");

        }
        catch (Exception obj ){

            System.out.println("Somthing went wrong ");

        }
        System.out.println("GOOD");

    }




}
