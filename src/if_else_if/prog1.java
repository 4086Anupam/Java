package if_else_if;

public class prog1 {
    public static void main(String[] args) {

        int x = 40;
        int y = 5;
        int z = 9;

        if (x > y && x > z)

            System.out.println("x value is " + x);

        else if (y > z && y > x) {
            System.out.println("y value is " + y);
        } else
            System.out.println(z);
    }
}
