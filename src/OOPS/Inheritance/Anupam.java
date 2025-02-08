package OOPS.Inheritance;

public class Anupam {

    String name;
    int age  ;

    void Sc(){
        System.out.println("My School name is ");
    }

}

class School extends Anupam{



}

class collage extends Anupam{

    void cl() {
        System.out.println("My collage name");
    }

}

class In {

    public static void main(String[] args) {

        collage obj =new collage();
        obj.cl();
        obj.name = "FIEM";
        School obj1 = new School();
        obj.Sc();
        obj.name= " TENPUR , JHS ";


    }


}
