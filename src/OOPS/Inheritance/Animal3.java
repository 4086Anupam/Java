package OOPS.Inheritance;

// Hierarchical Inheritance

public class Animal3 {

    void eat(){
        System.out.println("Eating");
    }
}

class Dog1 extends Animal3{
    void slep(){

        System.out.println("sleeping");

    }
}

class Cat3 extends Animal3{

    void bark(){

        System.out.println("Barking");

    }

}

class TestInheritance1 {

    public static void main(String[] args) {

        Cat3 obj=new Cat3();
        Dog obj2=new Dog();

        obj2.eat();
        obj2.bark();
        obj2.sleep();



    }

}
