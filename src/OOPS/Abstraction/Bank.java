package OOPS.Abstraction;

    public abstract class Bank {

       abstract float getRateOfInterest();

    }

// child class

    class SBI extends Bank {


        float getRateOfInterest(){

            return 2.5f;

        }

    }
    // child class
    class ICICI extends Bank {


        float getRateOfInterest(){

            return 3.5f;

        }

    }

    // child class
    class AXIS extends Bank {


        float getRateOfInterest(){

            return 4.5f;

        }

    }

    class Ploymorphism{

        public static void main(String[] args) {



            Bank obj1=new SBI();

            System.out.println(" SBI interest rate " + obj1.getRateOfInterest());

           Bank obj2 =new ICICI();

            System.out.println(" ICICI interest rate " + obj2.getRateOfInterest());

            Bank obj3 =new AXIS();

            System.out.println(" AXIS interest rate " + obj3.getRateOfInterest());
        }


    }


