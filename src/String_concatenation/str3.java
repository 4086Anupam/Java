package String_concatenation;

public class str3 {
    public static void main(String[] args) {


        String s1 = "ANUPAM";
        String s2 = "ANUPAM";

        System.out.println(s1.equals(s2)  + " " +  (s1.concat(" " + s2)));
        System.out.println(s1 + " " + s2 );


        String s3 =new String("Anupam");
       String s4= s3.concat(" Bhunia");
        System.out.println(  "" +s4);

    }


}
