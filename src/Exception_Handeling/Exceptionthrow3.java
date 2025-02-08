package Exception_Handeling;

import java.io.IOException;

public class Exceptionthrow3 {


    public static void age(int num) throws ArithmeticException {

        if ( num < 18) {
            throw new ArithmeticException("Not Eligible  for Driving ");
        }
        else {

            System.out.println("Eligible for Driving ");
        }

    }
    public static void a(int num) throws ArithmeticException{

        age(num);


    }


    public static void main(String[] args) throws ArithmeticException {

        try{
           a(41);

        }
    catch (ArithmeticException e){

        System.out.println(e.getMessage());

    }

    }

}