package Constructor;

public class Prog1 {

    String name;
    int MRP;
    int total_sheet;
// create constructor
Prog1(String name, int MRP, int total_sheet){
    this.name=name;
    this.MRP=MRP;
    this.total_sheet=total_sheet;

}
    public static void main(String[] args) {

        Prog1 obj = new Prog1("TATA", 500000, 45);
        System.out.println("Comapny name is TATA");
        System.out.println("Totol MRP" + " " +obj.MRP);
        System.out.println("Totol Sheet" + " " +obj.total_sheet);
    }
}