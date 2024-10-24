package Static_Keyword;

public class Hostel {

    static String name1;
    static String name2;
    static String name3;
    static String name4;
    static String name5;

    String name6;
    String name7;

    static {

        System.out.println("Hare Krishna Hostel");
        name1 = "Shankar Chakraborty";
        name2 = "Anupam Bhunia";
        name3 = "Surya Ghosh";
        name4 = "Soumya Das";
        name5 = "Aniruddha Day ";


    }

    public static void display() {

        System.out.println("Our family is :-  " );
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
    }

    Hostel(String name6,String name7){

        this.name6=name6;
        this.name7=name7;

    }

    public void disp(){

        System.out.println("In The Beninging family is");
        System.out.println(name6);
        System.out.println(name7);

    }


}

class Pg{


    public static void main(String[] args) {

       Hostel.display();

       Hostel obj=new Hostel("Satyajit","Gourish");
       obj.disp();


    }





}
