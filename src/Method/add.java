package Method;

public class add {

    int depth;
    int width;
    int height;


 void   volume(){
      int result = (depth*width*height);
     System.out.println("The result is "  +result);
  }


}

class boxd {
    public static void main(String[] args) {

        add obj1= new add();
        add obj2=new add();

        obj1.depth=10;
        obj1.height=20;
        obj1.width=5;


        obj2.height=5;
        obj2.width=6;
        obj2.depth=8;

        obj1.volume();
        obj2.volume();
    }


}
