package OOPS.Abstraction;

public abstract class Student {

    abstract void department();// Abstract Method

    // Not abstract method

    public void year(){

        System.out.println("3rd Year ");

    }

}

class Anupam extends Student{

    void department(){

        System.out.println("Information Technology");

    }

}

class Test{

    public static void main(String[] args) {

       Anupam obj =new Anupam();
       obj.department();
       obj.year();



    }


}
