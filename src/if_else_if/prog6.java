package if_else_if;

import java.util.Scanner;

public class prog6 {

    public static void main(String[] args) {

        // comment 1
        int month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();

        String season;

        if (month == 1 || month == 2 || month == 3) {
            season = "winter";
        } else if (month == 4 || month == 5 || month == 6) {
            season = "Spring";
        } else {
            season = "Automn";
        }

        switch (month){
            case 1 -> System.out.println("1");

            case 2 -> System.out.println("2");

        }
        System.out.println(season);
    }


}
