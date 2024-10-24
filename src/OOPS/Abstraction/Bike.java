package OOPS.Abstraction;

abstract class Bike {

  abstract void run ();
  // Hiding implement details

}

class Honda extends Bike{

    void run(){

        System.out.println("Running");

    }

}

class AbstractTest{

    public static void main(String[] args) {

        Bike obj=new Honda();
        obj.run();


    }



}
