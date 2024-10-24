package OOPS.Encapsulation;

public class Collage {

    private int student;
    private String collage;

    public void setCollage(String collage){
        this.collage=collage;
    }

    public String getCollage(){
        return collage;
    }

    public void setStudent(int student){
        this.student=student;
    }

    public int getStudent(){
        return student;
    }
}
class AboutCollage {
    public static void main(String[] args) {

        Collage obj =new Collage();
       obj.setCollage("FIEM");
        obj.getCollage();
        obj.setStudent(500);
        obj.getStudent();

        System.out.println("Collage name is " +obj.getCollage() );
        System.out.println("Student has " +obj.getStudent() );

    }


}
