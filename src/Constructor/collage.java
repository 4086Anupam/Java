package Constructor;

public class collage {

    private StringBuffer Name;
    private int capacity;
    private StringBuffer Department;


    public collage(StringBuffer Name) {
        this.Name = Name;
    }

    public collage(StringBuffer Name, int capacity) {
        this.Name = Name;
        this.capacity = capacity;

    }

    public collage(StringBuffer Name, int capacity, StringBuffer Department) {
        this.Name = Name;
        this.capacity = capacity;
        this.Department = Department;

    }

    void display(){
        System.out.println(Name);

    }

    void screen(){
        System.out.println(Name);
        System.out.println(capacity);
    }
    void out(){
        System.out.println(Name);
        System.out.println(capacity);
        System.out.println(Department);

    }

}
    class output {
        public static void main(String[] args) {

           StringBuffer st =new StringBuffer("FIEM");

           collage obj=new collage(st);
           st.append(" TECHNO");
            System.out.println( st);

              StringBuffer str =new StringBuffer("NASC");
            collage obj2=new collage(str,500);

            StringBuffer str1=new StringBuffer("IEM");
            StringBuffer str2=new StringBuffer("IT");

            collage obj3=new collage(str1,5000,str2);
            obj.display();
            obj2.screen();
            obj3.out();




        }
    }




