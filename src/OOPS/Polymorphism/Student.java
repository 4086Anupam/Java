package OOPS.Polymorphism;


// Parent  class
public class Student {

    void name (){

        System.out.println("What is your name");

    }


}

// Child Class
class Anupam extends Student{


    void name (){

        System.out.println("Anupam");

    }


}

class Surya extends Student{


    void name (){

        System.out.println("Surya");

    }


}


class PolymorphismTest {

    public static void main(String[] args) {

        Student obj =new Anupam(); // Upcasting
        Student obj1 =new Surya(); // Upcasting
        obj.name();
        obj1.name();



    }


}


// Upcasting -- if reference variable of parent class refer to object of child class that is called upcasting

// Parent class -- if  class whose features  inherited  that is called Parent class

// Child class -- if  class inherit the other class  that is called Child class

// Polymorphism -- Polymorphism is oops concept which we can perform any single actin in different ways.
//    Polymorphism means poly means many and morphism means forms that means many forms.
// we can used polymorphism in java by method overloading and method overriding

// Two type polymorphism :- 1. Compile-time polymorphism  2. Runtime polymorphism

