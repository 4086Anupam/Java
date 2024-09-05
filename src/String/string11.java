package String;

public class string11 {

    public static void main(String[] args) {

        // This is Replace function
        String s1= "Anupam";
       String s2=  s1.replace("A","M");  // This is Replace function

        System.out.println(s2);

        // this is equals function
        String st= "Anupam"; // this string create in string constant pool area

        String s3 =new String("Anupam"); // This string create in heap area

        System.out.println(st.equals(s3));

        System.out.println(s1.equals(st));

        String s4= new String("Anupam");

        System.out.println(s3.equals(s4)); // this is equals function

       // this is equalsignorecase function ()

         String name1 = "Anupam";
         String name2 = "ANUPAM";

        System.out.println(name1.equalsIgnoreCase(name2));

        String name3 = new String("Rita");
        String name4 = "RitA";

        System.out.println(name3.equalsIgnoreCase(name4));

        System.out.println(name3.equalsIgnoreCase(name4));

    // Concatenation function ()
        String con1="Shankar_Da";
        String con2= "Surya";
        String con3 = "Anupam";
        String con4 = "Ani";
        String con5 =new String("Soumya") ;


         // used by  concatenation function
        System.out.println(con1.concat(" "+ con2).concat(" "+ con3).concat(" "+ con4).concat(" "+ con5));

        // " + " used by operator function

        String str1=new String("Shankar_Da");
        String ster2 = "Surya";
        String str3= "Anupam";
        String str4 = "Ani";
        String str5=new String("Soumya") ;

        int age1  =26;
        int age2= 21;
        int age3 =20;
        int age4 =20;
        int age5=22;

        System.out.println(str1 + " " + age1 +  " " + ster2 + " " +age2 +  " " + str3 + " " + age3 +  " " + str4 +" " +age4 +  " " + str5 + " " + age5);


      // this is length function ()

        String var1 = "Future Institute of Engineering & Management ";

        System.out.println(var1.length());
        System.out.println(var1.lines());








    }



}
