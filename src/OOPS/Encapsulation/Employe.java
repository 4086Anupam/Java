package OOPS.Encapsulation;

public class Employe {

    private String name;
    private int age;

    public Employe(){

        System.out.println("This is IT Employee");
        name="Anupam";
        age = 21;

    }

    public Employe(String name){

      this("ani",52);
        this.name=name;
        age=20;
    }

    public Employe (String name, int age){

        System.out.println("Who are you ");

        this.name=name;
        this.age=age;

    }
    void display(){

        System.out.println(name);
        System.out.println(age);

    }


}

class AccessUser{


    public static void main(String[] args) {

        Employe obj=new Employe();
        obj.display();

        Employe obj2=new Employe("Surya");
        obj2.display();

        Employe obj3=new Employe("Ani",22);
        obj3.display();


    }


}
