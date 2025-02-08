package Exception_Handeling;

import java.io.IOException;

public class Demo {

    public static void A() throws Exception{

       int num1=9;
       int num2=0;
       int result=num1/num2;

    }


    public static void main(String[] args) {


        try{

          A();
        }catch (Exception e){

            System.out.println("Error");
        }



    }



}
