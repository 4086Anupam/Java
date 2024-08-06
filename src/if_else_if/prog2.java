package if_else_if;

public class prog2 {

    public static void main(String[] args) {

        int month = 4;


        if (month == 1 || month == 2 || month == 3)
            System.out.println("Winter");

        else if (month == 4 || month == 5 || month == 6) {
            System.out.println("Summer");
        } else
            System.out.println("Autumn");
    }
}
