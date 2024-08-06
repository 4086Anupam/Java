package Method_Overloading;

public class prog3 {


   void  Method3 (String name,int age ){

       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
    }

    int Method3(int n1,int n2){
       int Result =n1+n2;
      return Result;

    }

    public static void main(String[] args) {
        prog3 object = new prog3();
     object.Method3("Anupam",20);
    int re= object.Method3(20,30);
        System.out.println(re);
    }


}
