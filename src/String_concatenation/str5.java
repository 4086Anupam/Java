package String_concatenation;

public class str5 {

    public static void main(String[] args) {

     String s1 = "Ani"  ;
     String s2 = "Shankar Da";
     String s3 =new String("Surya");
     String s4= s2.concat( " " + s3);

        System.out.println(s1.concat(s3).concat(s2));
        System.out.println(s4);
int age=20;
int age2 =25;
        System.out.println(s1 + " " +age + " " + s2 + " " +age2 );

        System.out.println(s1.concat("" + s2) + " "+ age);


    }

}
