package OOPS.Inheritance;

public class A {

int a,b;

    public  A(){

        System.out.println("Parent class Constructor  ");

    }

    public  A(int a,int b){

        System.out.println("Parametrizes parent class constructor");
        this.a=a;
        this.b=b;

    }

}


class B extends A{

    int x,y;

    public  B(){

        System.out.println("Child  class Constructor  ");

    }
    public  B(int x,int y){
       super();
       this.x =x;
       this.y=y;

        System.out.println("Parametrizes Child class constructor " +x +y);
    }

}

class c {
    public static void main(String[] args) {

       B obj =new B(10,20);

    }

        }


