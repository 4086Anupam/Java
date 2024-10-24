package OOPS.Polymorphism;

// Parent class
public class Animal {

    void eat (){
        System.out.println("Eating");

    }

}

// Child Class
class Dog extends Animal{

    void eat(){

        System.out.println("Dog eating");

    }

}
class Polymorphism{

    public static void main(String[] args) {

        Animal obj =new Dog(); // Upcasting
       obj .eat();
    }


}

