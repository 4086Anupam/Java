package OOPS.Inheritance;

 class Student { // Parent class

    String name;
    int age ;



}

 class Student1 extends Student{ // Child class

    void display(){

        System.out.println("My name is "+name);
        System.out.println("My age is " + age);
    }

}

class Acces {

    public static void main(String[] args) {
       Student1 obj =new Student1();
       obj.name="Anupam";
       obj.age=20;

       obj.display();



    }


}
