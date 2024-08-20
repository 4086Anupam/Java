package Class.Class_Object;

public class prog8 { //  Class name

    String name; // Instance variable
    String college; // Instance variable
    int age ; // Instance variable
    String roll_number ; // Instance variable


    public static  void main  (String[] args){

        prog8 Student1=new prog8(); // Declaring object 1
        prog8 Student2=new prog8(); // Declaring object 2

        Student1.name="Anupam Bhunia";
        Student1.college="FIEM";
        Student1.age=20;
        Student1.roll_number="22IT07";

        Student2.name="Surya Ghosh";
        Student2.college="FIEM";
        Student2.age=20;
        Student2.roll_number="22ECE121";

        System.out.println("My name is "  +Student1.name +"\tage is\t" +Student1.age+ "\tcollege is\t "+ Student1.college +"\t college roll number is \t" +Student1.roll_number );
        System.out.println("My name is "  +Student2.name +"\tage is\t" +Student2.age+ "\tcollege is\t "+ Student2.college +"\t college roll number is \t" +Student2.roll_number );
    }





}
