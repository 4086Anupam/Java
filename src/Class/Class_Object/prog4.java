package Class.Class_Object;

public class prog4 {
     // Instance variable
    int width;
    int length;
    int height;

    void  math (){ //  Declaring Method
        System.out.println("The result is ");
        System.out.println(width*length*height);
    }

    public static void main(String[] args) {
        prog4 var1=new prog4();
        var1.height=5;
        var1.length=5;
        var1.width=5;

         var1.math(); // calling  to method
    }


}
