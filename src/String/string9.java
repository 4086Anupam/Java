package String;

public class string9 {

    public static void main(String[] args) {

        String s1 = "Future";
        String s2= "FIEM";
        String s3 = new String("FUTURE");
        String s4 = new String("FIEM");


        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s2.equalsIgnoreCase(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.equals(s2));



    }




}
