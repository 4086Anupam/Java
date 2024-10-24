package OOPS.Inheritance;


// Single level Inheritance


public class Animal {

    void eat(){

        System.out.println("Eating");

    }



}


class Cat extends Animal{

    void bark(){

        System.out.println("Barking");

    }


}

class TestInheitance {
    public static void main(String[] args) {

        Cat obj=new Cat();

        obj.eat();
        obj.bark();



    }
}


