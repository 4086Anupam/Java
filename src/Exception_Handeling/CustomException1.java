package Exception_Handeling;

public class CustomException1 extends Throwable {

    public CustomException1(String message){
        super(message);
    }


}


class SetText{

    public static void main(String[] args) {

      try{

          throw new CustomException1("This is message ");
      }catch (CustomException1 e){

          System.out.println(e.getMessage());
      }

        

    }


}