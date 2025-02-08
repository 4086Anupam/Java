package Interface;

interface Example {
 void print();

}

class A implements Example{

   public void print(){

       System.out.println("Hello");
   }

}
class Interface {
    public static void main(String[] args) {

      A obj =new A();
      obj.print();

    }
}
