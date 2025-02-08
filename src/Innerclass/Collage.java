package Innerclass;

public class Collage {

    String name;


    static class Person {

        String name;
        String Dept;
        int roll;
        public void details(){

            System.out.println(" My name is "+ name + "i have study" +Dept + " Class roll " +roll);


        }

    }


}
class In {
    public static void main(String[] args) {
       Collage obj = new Collage();
       obj.name= " FIEM";
       Collage .Person obj2= new Collage.Person();
    }
}