package Exception_Handeling;

public class Exceptionfirst {

    public static void main(String[] args) {

        int num1 =9; // Normal statement
        int num2 =0;

        int result=0;


        try{

            result = num1 /num2 ; // Critical statement

        }
        catch (Exception obj ){

            System.out.println("Something went wromg ..." + obj );

        }
        System.out.println("Result is " + result);



    }

}
