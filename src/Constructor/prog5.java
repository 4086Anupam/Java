package Constructor;

public class prog5 {

String name;
String name1;
    String name2;
String name3;
    String name4;
    String name5;
    String name6;

prog5(String name,String name1,String name2,String name3,String name4,String name5,String name6){
    this.name=name;
    this.name1=name1;
    this.name2=name2;
    this.name3=name3;
    this.name4=name4;
    this.name5=name5;
    this.name6=name6;


}


    public static void main(String[] args) {
        prog5 obj=new prog5("Anupam","Shankar_Da","Surya","Soumya","Ani","Gourish","Satyajit");

        System.out.println("We are Pg met :-\t");
        System.out.println(obj.name);
        System.out.println(obj.name1);
        System.out.println(obj.name2);
        System.out.println(obj.name3);
        System.out.println(obj.name4);
        System.out.println(obj.name5);
        System.out.println(obj.name6);


    }



}
