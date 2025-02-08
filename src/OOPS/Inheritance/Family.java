package OOPS.Inheritance;

public class Family {  // Super class

  String name;
  int age ;

  void Family1(){
      System.out.println("This is our Bhunia family ");
  }


}

 class Parent extends Family{




}

class Child extends Parent {




}

class Inhet{

    public static void main(String[] args) {

       Child obj =new Child();

       obj.name="Anupam";
       Parent obj2=new Parent();
       obj2.name="Rita";
       Family obj3=new Family();
       obj3.name="Bhunia Family";
       obj3.Family1();
        System.out.println(obj2.name);

    }


}
