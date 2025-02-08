package Exception_Handeling;

public class throws2 {

   public static void a() throws Exception{

       int num1 =8;

       int num2 =0;

       int result =num1/num2;


   }

    public static void b(int age ) throws Exception  {

       if (age <18){
throw new ArithmeticException("Not eligible ...");

       }
        System.out.println("Eligible ...");

    }

    public static void main(String[] args) throws Exception {

       try {
         a();
           b(8);
       }catch (ArithmeticException e){

           System.out.println(e.getMessage() );
       }



    }
}
