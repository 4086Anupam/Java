package Method_Overloading;

public class prog2 {

   int multipication(int n1,int n2){

    int result = (n1*n2);

    return result;


}

    int multipication(int n1,int n2,int n3){
   int out = (n1 *n2 * n3);
   return out ;

   }

    double multipication(double n1,double  n2){

       return (n1 * n2 );
    }

    public static void main(String[] args) {

     prog2 obj=new prog2();
       int result =obj.multipication(5, 6);
      int result2= obj.multipication(7,8,6);
     double result3 =  obj.multipication(8.7,9.1);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }




}
