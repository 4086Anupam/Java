package Exception_Handeling;

public class Exception3 {

    public static void main(String[] args) {

        int num1 =45;
        int num2 =0;

        String name ="Anupam ";

 int array[] = {7,8,9,4,5};

        try{

          //  int result = num1/num2;
            System.out.println(array[6]);
        }
        catch (ArithmeticException obj ){

            System.out.print("Error is found \n" );

        }
       catch (ArrayIndexOutOfBoundsException obj ){

            System.out.println("Can not found the name ");
        }
        catch (Exception obj ){
            System.out.println("i dont know ");

        }

        System.out.println("Application run successfully ");
    }


}
