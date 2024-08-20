package Class.Class_Object;

public class prog1 {

String name;
int age;

void student(){ //   Declaring Method
    System.out.println(age);
    System.out.println(name);
}

    public static void main(String[] args) {
         prog1 var=new prog1(); // Declaring object
         var.age=20;
         var.name="Anupam";
var.student(); // call to Method
    }


}
