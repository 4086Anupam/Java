package Java_Practice.Class_Object;

public class prog5 {
    // Instance variable
  String name;
  int student ;

  void FIEM(){
      System.out.println("The college name is :" +name +" " +student);

      prog5 obj1 =new prog5();
      student=5000;
      name="Techno";

      System.out.println(name + " " +student);


  }


    public static void main(String[] args) {

        int num=9; // Local variable

        prog5 obj =new prog5();
        obj.name="Future Institute of Engineering & Management ";
        obj.student=1200;

        obj.FIEM();



    }

    
}
