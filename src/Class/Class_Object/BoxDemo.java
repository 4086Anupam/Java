package Class.Class_Object;

public class BoxDemo {

    double width;
    double height;
    double depth;



   double volume (){
        return width*depth*height;
    }

}


class Box{
    public static void main(String[] args) {


      BoxDemo mybox ; // Declare reference to object
        mybox = new BoxDemo(); // allocate to box object
         double vol;

         mybox.width=10;
         mybox.height=20;
         mybox.depth=15;

         vol=mybox.volume();
        System.out.println("The Result is " +vol);

    }





}
