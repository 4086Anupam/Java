package Interface;


// Interface inheritance
interface Hello {

    void print();

}

interface FirstCode extends Hello{

    void c();

}

class ExampleInheritance implements FirstCode{


  public   void print(){

      System.out.println("Hello world");

  }

  public void c (){

      System.out.println("C programming");

  }


}

class TestInheritance{

    public static void main(String[] args) {

      ExampleInheritance obj =new ExampleInheritance();
        obj.print();
        obj.c();

    }

}


