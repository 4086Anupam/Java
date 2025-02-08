package Exception_Handeling;

public class Exceptionthrow4 {


    public static void method1(int age ) throws ArithmeticException {

        if (age<18){
           throw new ArithmeticException("Sorry, u can not enter ");

        }
        System.out.println("Sure, You Enter ");

    }

    public static void a(int age)throws ArithmeticException {

        method1(age);

    }

    public static void main(String[] args) {

        try{

           method1(8);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }
        System.out.println("Application Run successfully ");
    }



}
