package String;

public class equals1 {

    public static void main(String[] args) {

        String s1 ="ANUPAM";
        String s2 ="ANUPAM";
        String s3 =new String("anupam");
        String s4= new String("ANUPAM");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s2));



    }


}
