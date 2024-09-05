package String_concatenation;

public class str2 {

    public static void main(String[] args) {



        String s1 = new String("Future");
        String s2 =new String("Institute");
        String s3 = "Engineering";
        String s4 = new String(" Management");


        System.out.println(s1 + " " + s2 + " " + "of " + " " + s3 + " " + s4 );
        System.out.println(s1.concat( " "+ s2 )+  " " +(s3.concat(s4)));
        System.out.println(s1.concat( " " + s2).concat( " " +s3).concat(s4));

    }
}
