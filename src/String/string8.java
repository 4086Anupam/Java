package String;

public class string8 {

    public static void main(String[] args) {

String s1 ="Hello";
String s2 = "HELLO";
String s3 = "FIEM";
String s4 ="fiem";
String s5 = "Good boy";

        System.out.println(s3 +  " " + "Equal" + " " + s4 +   " " + "-> "  +(s3.equalsIgnoreCase(s4)));

        System.out.println(s1 + " " + "Equal" + " "+ s2 + "-> " + (s1.equals(s2)));

        System.out.println(s1.equals(s5));


    }

}
