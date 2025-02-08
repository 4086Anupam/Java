package Interface;

interface Animal{

   public abstract void eat ();

}

interface Human{

   public abstract void sleep();

}

class  Dog implements Animal,Human{

   public  void eat(){

        System.out.println("Eating ");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}


class InterfaceTest {

    public static void main(String[] args) {

       Dog obj =new Dog();

       obj.eat();
       obj.sleep();

    }

}


