package Java_Practice.Class_Object;

public class prog2 { // class name
    int width; // Instance Variable
    int length; // Instance Variable
    int depth; // Instance Variable

    public static void main (String[]args){

       prog2 mybox=new prog2() ; // Declaring object

        mybox.width=100; // Assign value to  width instance variable
        mybox.length=100; // Assign value to  length instance variable
        mybox.depth=100; // Assign value to depth instance variable

        int result= (mybox.width* mybox.length* mybox.depth);

        System.out.println(result);
    }
}
