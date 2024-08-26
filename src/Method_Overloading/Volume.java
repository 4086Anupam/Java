package Method_Overloading;

public class Volume {

int length;
int radius;
int height;
int width;

int test(int length){

    return length * length *length;
}

double test (int radius , int height){

    return 3.14*radius*height;

}

int test (int length,int height,int width){

    return length * height * width;
}


}

class VolumeDemo{
    public static void main(String[] args) {

      Volume  obj;
      obj=new Volume();

      obj.length=5;
      obj.height=5;
      obj.radius=10;
      obj.width=5;

          int result1 = obj.test(5);
         double result2 =obj.test(10,5);
         int result3 = obj.test(5,5,5);

        System.out.println("Volume of cube : " +result1);
        System.out.println("Volume of cylinder :" +result2) ;
        System.out.println("Volume of rectangular :" +result3);
    }




}
