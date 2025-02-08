package Exception_Handeling;

import java.io.IOException;

public class Throws1 {

   public static void m()throws IOException{
       throw  new IOException("Device Error...");

   }

    public static void n() throws IOException{
        m();
    }

    public static void main(String[] args) {

       try {

           n();

       }catch (IOException e)  {
           System.out.println("Error Handled ");
       }
        System.out.println("Application Successfully ");

    }
}
