package Innerclass;

public class Person {  //  class A

     String name;
     int age;
      class Address {  //  class B

       String city;
       int pincode;


    }

}
class Inn {

    public static void main(String[] args) {

      Person obj = new Person();
      obj.name="Anupam Bhunia";
        obj.age =21;
       Person.Address obj2 =  obj.new Address();
        obj2.city= " Kolkata";
        obj2.pincode=721201;

        System.out.println(obj2.city);
    }



}