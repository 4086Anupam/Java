package Java_Practice.Class_Object;

public class prog7 {// class name

    String name; // Instance  variable
    int age ;  // Instance   variable

    // Constructor
    prog7(String name, int age){
        this.age=age;
        this.name=name;
    }
//

    public static void main(String[] args) { //   main function


        prog7 s1=new prog7("Anupam",20);

        System.out.println(s1.name); // Access value to  instance variable
        System.out.println(s1.age); // Access value to  instance variable
    }


}