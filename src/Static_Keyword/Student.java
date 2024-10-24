package Static_Keyword;

public class Student {


    // Static Variable
    static  String name1;
    static int age1;

    // Instance variable
    String name2;
    int age2;

  //

    // Static block
    static {
        System.out.println("This is static block");
        name1 ="ANUPAM";
        age1=20;
        //System.out.println("This is static block");

    }
  // Non Static block
    {
        System.out.println("This is non static block");
        name2="Anupam";
        age2 = 21;
        //System.out.println("This is non static block");

    }
   // static  method
    static void display(){
        System.out.println("My name is  "+ name1);
        System.out.println("My age is "+ age1);

    }
  // Non   static  method
    void display1(){

        System.out.println("My name is  "+ name2);
        System.out.println("My age is "+ age2);
    }

}
class TestStaticKeyword {
    public static void main(String[] args) {

 Student obj=new Student();
    obj.display1(); // non static call

        Student.display();

    }
}



