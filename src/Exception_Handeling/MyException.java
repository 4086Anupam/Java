package Exception_Handeling;

public class MyException extends Exception{

    MyException (String mes){

        super(mes);
    }

}


class IUser{

    public static void main(String[] args) throws MyException {
        int age = 51;
        try {
            if (age < 18) {

                throw new MyException("Dont Enter ");


            }

            System.out.println("U can enter ");


        }
        catch (MyException e){

            System.out.println(e.getMessage());


        }
    }



}