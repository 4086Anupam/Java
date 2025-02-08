package OOPS.Encapsulation;

public class Student2 {

   private  String name;
   private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age ){
       if (age<0){
           age =0;
       }
       this.age=age;

   }

   public int getAge(){
       return age;
    }





}

class Test {

    public static void main(String[] args) {

        Student2 obj =new Student2();
        obj.setAge(22);
        System.out.println( obj.getAge());




    }




}
