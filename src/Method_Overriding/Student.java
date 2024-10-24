package Method_Overriding;

public class Student {

    public void name (){


        System.out.println("Anupam");


    }



}

class Student1 extends Student{

    public void name (){

        System.out.println("Suman");
        System.out.println("He is my Childhood friend ");

    }



}

class TestOverriding{

    public static void main(String[] args) {

        Student1 obj=new Student1();

        obj.name();



    }


}
