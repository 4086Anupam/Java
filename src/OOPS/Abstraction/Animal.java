package OOPS.Abstraction;



public abstract class Animal {

   public  abstract void eat ();


}

class Dog extends Animal{

   public  void eat(){

       System.out.println("Dog Eating ");


   }

}

class Tiger extends Dog{


    public void jangal(){

        System.out.println("Tiger in jangle");

    }


}
class User {
    public static void main(String[] args) {



       Tiger obj1=new Tiger();
        obj1.jangal();
        obj1.eat();

    }
}