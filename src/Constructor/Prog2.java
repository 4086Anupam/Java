package Constructor;

public class Prog2 {

    String name;
    int age ;
    String address;

    Prog2(String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public static void main(String[] args) {

       Prog2 obj=new Prog2("Anupam Bhunia","Chanda",20);

        System.out.println("My nam is "+""+obj.name + "" +" from  " + "" + obj.address + "" +" age is " + "" + obj.age );


    }


}
