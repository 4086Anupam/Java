package Constructor;

public class prog6 {
// instance variable
    String name;
    String college;
    String Department;
    String Roll_Number;
    int age;
// constructor
    prog6(String name, String college, String Department, String Roll_Number, int age) {

        this.name = name;
        this.college = college;
        this.Department = Department;
        this.Roll_Number = Roll_Number;
        this.age = age;

    }

    public static void main(String[] args) {
    // Decletion object and calling constructor
        prog6 obj = new prog6("Anupam", "FIEM", "IT", "22IT07",20);


        // Print data


        System.out.println(obj.name);
        System.out.println(obj.college);
        System.out.println(obj.Department);
        System.out.println(obj.Roll_Number);
        System.out.println(obj.age);


    }

}
