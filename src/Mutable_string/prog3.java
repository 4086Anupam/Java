package Mutable_string;

public class prog3 {
    public static void main(String[] args) {

       String st1 ="JHS"; // String literal

        StringBuffer st = new StringBuffer("Anupam");  // Mutable string
    st.append("Bhunia");

        System.out.println(st);
        System.out.println(st.capacity());
        System.out.println(st.deleteCharAt(2));

        System.out.println(st);
        System.out.println(st1);
    }




}
