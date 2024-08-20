package Class.Class_Object;

public class prog6 {

    int width;
    int weight;
    int height;

    int area(int w,int h,int w1){
        width=w;
        weight=w1;
        height=h;
        int result = (width*weight*height);
        return result ;
    }

    public static void main(String[] args) {



        prog6 obj=new prog6();
        int result = obj.area(4,5,6);
        System.out.println(result );

    }


    public static class parameter2 {

        int num1;
        int num2;
        int num3;

       int   parameter2 (int num1,int num2,int num3){

            this.num1=num1;
            this.num2=num2;
            this.num3=num3;
            int result = (num1+num2+num3);

            System.out.println(result);
    return result;
        }

        public static void main(String[] args) {

         parameter2 obj = new parameter2() ;
         obj.parameter2(5,6,4);






        }









    }
}
