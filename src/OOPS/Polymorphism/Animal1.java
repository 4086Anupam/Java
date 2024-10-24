package OOPS.Polymorphism;

// Multilevel inheritance

public class Animal1 {

  void eat(){

      System.out.println("Animal Eating ");

  }


}

class BabyDog extends Animal {

    void eat(){

        System.out.println("BabyDog Eating ");

    }

}

class Cat extends BabyDog{


    void eat(){

        System.out.println("Cat Eating ");

    }

}

class PolymorphismMultilevel {

    public static void main(String[] args) {

       Animal obj =new Cat(); // Upcasting
        obj.eat();

        Animal obj1 =new BabyDog(); // Upcasting
      obj1.eat();
    }


}
