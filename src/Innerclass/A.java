package Innerclass;

public class A {

    void show(){

        System.out.println("In show");

    }


   class B {

   void display(){

       System.out.println("In display");

   }


    }

}

 class Inner{

    public static void main(String[] args) {

        A obj = new A();
       obj.show();
        A. B obj1= obj.new B();
       obj1.display();

    }




}
