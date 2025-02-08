package Interface;

interface Bank {

    float rateOfInterest();

}

class SBI implements Bank {

    public float rateOfInterest(){

        return 9.15f;

    }


}
class PNB implements Bank {

    public float rateOfInterest(){

        return 9.7f;

    }


}


class TestInterface{


    public static void main(String[] args) {

      Bank obj =new PNB();



        System.out.println("PNB Bank " + obj .rateOfInterest());


    }
}



