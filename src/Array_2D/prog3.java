package Array_2D;

public class prog3 {

    public static void main(String[] args) {

        int var[][]=new int[3][3];
        var[0][0]=10;
        var[0][1]=20;
        var[0][2]=30;
        var[1][0]=40;
        var[1][1]=50;
        var[1][2]=60;
        var[2][0]=70;
        var[2][1]=80;
        var[2][2]=90;


        // Enhanced formet

//        for (int var1[]:var){
//            for(int v:var1){
//                System.out.print(v + " ");
//            }
//            System.out.println();
//        }

        // Basic formet
  for (int i =0;i<=2;i++){ // for row

      for (int j=0;j<=2;j++){  // for column
          System.out.print(var[i][j] + " ");

      }
      System.out.println();
  }


    }

}
