package OOPS.Encapsulation;

public class Calculater {

    private int a;
    private int b;
    private int result;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public int getResult() {

        result = (a + b);
        return result;
    }

    public void setResult(int result) {

        {
            this.result = result;
        }

    }
}


    class test1 {

        public static void main(String[] args) {

            Calculater obj = new Calculater();

            obj.setA(8);
            obj.setB(9);
            System.out.println(obj.getResult());


        }
    }


