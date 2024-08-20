package Class.Class_Object;

public class prog9 {

    int width;
    int height;
    int depth;


    int volume() {

        return width * height * depth;


    }
}
class box{

    public static void main(String[] args) {



      prog9 obj=new prog9();

         obj.width=5;
         obj.height=6;
         obj.depth=1;

         int result=obj.volume();
        System.out.println(result);

    }



}

