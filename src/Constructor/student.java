package Constructor;

public class student {

    private String name;
    private int roll;
    private int age;

    student (String name , int roll ,int age ){
        this.name=name;
        this.roll=roll;
        this.age=age;


    }

   void display(){

       System.out.println(name + " " + roll + " " + age );
   }


}

class Info{
    public static void main(String[] args) {

      student obj =new student("Anupam",07 , 20) ;

      obj.display();

    }
}

