package Method_Overriding;

// Parent class
public class Animal {

    public void eat(){

        System.out.println("Animal is eating");

    }

}

// Child class

class Dog extends Animal{
public  void eat (){

    System.out.println("Dog is eating ");

}

}

class Cat extends Dog {

    public void eat(){

        System.out.println("Cat is eating");

    }


}


class TextOverriding {


    public static void main(String[] args) {

        Dog obj =new Dog();
        obj.eat();

        Cat obj1 =new Cat();
        obj1.eat();

    }


}
