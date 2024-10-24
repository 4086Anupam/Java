package OOPS.Inheritance;

public class Laptop {

  int x,y;

  // Constructor
  public Laptop(int x,int y){

      this.x=x;
      this.y=y;
      System.out.println("Parent class constructor ");
      System.out.println(" x is " + x);
      System.out.println(" y is " + y);

  }

}


class M extends Laptop {


    public M(int x, int y) {
        super(x,y);
        this.x=x;
        this.y=y;
        System.out.println("Child  class constructor ");
        System.out.println(" x is " + x);
        System.out.println(" y is " + y);
    }



}

class Inheritance {

    public static void main(String[] args) {

         M obj = new M(10,20);

    }


}