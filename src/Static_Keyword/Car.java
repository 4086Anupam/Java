package Static_Keyword;

public class Car {


    static String name;
    static int buy;

    static {

        System.out.println("Static block ");
        name = "TATA";
        buy = 500000;

    }

    static void display() {

        System.out.println("I have one " + name + " car " + " which perches buy  " + buy);
    }


    public static void main(String[] args) {

        Car.display();


    }
}
