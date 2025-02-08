package Innerclass;

interface Car {
 void drive();

}

class Ano {

    public static void main(String[] args) {

        Car obj = new Car()
        {
            public void drive() {

                System.out.println("Driving");


            }

        };
        obj.drive();


    }

}


