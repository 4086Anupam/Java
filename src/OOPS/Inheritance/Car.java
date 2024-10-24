package OOPS.Inheritance;

public class Car {

    String name ;
    String color;

    void display(){
        name="TATA";
        color = "Blue";

        System.out.println("Car is "+name +" "+ "Color is " + color );
    }



}

  class Car2 extends Car{

    String name;
    int price;

    void disp(){

        name="Mahindra";
        price = 500000;
        System.out.println("car name is "+name+ " " + "Price is  " + price);

    }

}
class  Access {
    public static void main(String[] args) {


        Car2 obj = new Car2();
        obj.display();
        obj.disp();

    }
}