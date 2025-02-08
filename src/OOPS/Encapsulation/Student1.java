package OOPS.Encapsulation;

public class Student1 {
    private String name;
    private int age;
   private  int roll;

   public Student1(){


       System.out.println("Default constructor in java ");
       System.out.println("who are you ");
       name="Rohan";
       age=18;

   }

   public Student1(String name){
    this("Ani",25);
       this.name=name;
       age=19;

   }

   public Student1 (String name , int age){
       this();
       this.name=name;
       this.age=age;

   }

   void display(){

       System.out.println(name);
       System.out.println(age);
   }

}
class User1{

    public static void main(String[] args) {

        Student1 obj=new Student1("Surya");
        obj.display();
        Student1 obj2=new Student1() ;
        obj2.display();
        Student1 obj3=new Student1("Anupam",20);
       obj3.display();

    }



}