package Method_Overloading;

public class prog1 {

    // Method overloading is have same method name but different parameter

    // Method 1
    int add(int n1, int n2) {
        return n1 + n2;
    }

    // Method 2
    int add(int n1, int n2, int n3) {

        return n1 + n2 + n3;
    }


    public static void main(String[] args) {

        prog1 obj = new prog1();
        int result1 = obj.add(5, 5);
        int result2 = obj.add(7, 4, 8);

        System.out.println(result1);
        System.out.println(result2);

    }
}