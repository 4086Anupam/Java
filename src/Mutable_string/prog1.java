package Mutable_string;

public class prog1 {

    public static void main(String[] args) {

        StringBuffer str=new StringBuffer("Virat");

        System.out.println(str);
        str.append("Kohli");

        System.out.println(str);

        String st = "Anupam";

        String st2="Bhunia";

        System.out.println(st.concat(  " "+ st2));

        System.out.println(str + " " + st);



    }




}
