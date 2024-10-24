package Mutable_string;

public class Student {

    StringBuffer name;

    Student(StringBuffer name){
        this.name=name;
    }


    public static void main(String[] args) {

      StringBuffer boj=new StringBuffer("Anupam");
      StringBuffer obj=new StringBuffer("Rita");


      boj.append("Bhunia");
      obj.append("Bhunia");

        System.out.println(boj );
        System.out.println(obj);

    }




}
