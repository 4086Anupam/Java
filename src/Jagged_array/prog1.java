package Jagged_array;

public class prog1 {

    public static void main(String[] args) {

      int a[][] =new int [3][2] ;
      a[0][0]=10;
      a[0][1]=20;
      a[1][0]=30;
      a[1][1]=40;
      a[2][0]=50;
      a[2][1]=60;

      for (int var []:a){
          for(int b:var) {
              System.out.print(b +" ");
          }
          System.out.println();
      }




    }


}
