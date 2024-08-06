package Constructor;

public class Prog4 {

    String name;
    String roll;
    int age ;

    Prog4(String name, String roll , int age){
        this.name=name;
        this.roll=roll;
        this.age=age;
    }


    public static void main(String[] args) {

        Prog4 obj = new Prog4("Anupam Bhunia","22IT07",20);


        System.out.println(obj.name);
        System.out.println(obj.roll);
        System.out.println(obj.age);
    }


}
