package Interface;

interface Drawable {

    void draw();

}


class Rectengle implements Drawable{ // rectengle class

    public void draw(){


        System.out.println("Drawing ");
    }


}

class Circle implements Drawable{ // circle class


   public  void draw(){

       System.out.println("Drawing Circle ");

    }


}

class Test{

    public static void main(String[] args) {

        Drawable obj =new Circle();



        obj.draw();


    }
}
