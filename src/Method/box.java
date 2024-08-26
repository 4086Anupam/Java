package Method;

public class box {

    int width;
    int depth;
    int height;

    int volume(int width,int height,int depth){

     return width*height*height ;

    }

}

class boxdemo{

public static void main (String []args){

    box obj=new box();
   int result =  obj.volume(5,5,5);

    System.out.println(result);
}


}


