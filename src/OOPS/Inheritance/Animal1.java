package OOPS.Inheritance;


// Multilevel Inheritance

public class Animal1 {

    void eat (){

        System.out.println("Eating");


    }

}

class Cat1 extends Animal1{

    void bark(){

        System.out.println("Barking");

    }


}


class Dog extends Cat1{


    void sleep(){

        System.out.println("Sleeping");


    }


}


class Lion extends Dog{

    void king(){

        System.out.println("The king of Jungle");


    }



}

class TestInheritance{


    public static void main(String[] args) {


        Lion obj=new Lion();

        obj.eat();
        obj.sleep();
        obj.bark();
        obj.king();

    }

}
