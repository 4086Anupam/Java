package Method;

public class parameter {

    int height;
    int depth;
    int width;


    int volume() {
        return width * depth * height;

    }

    void setdemo(int w, int d, int h) {
        width = w;
        depth = d;
        height = h;
    }


    public static void main(String[] args) {

        parameter obj = new parameter();

        obj.setdemo(5,5,5);

        int result =obj.volume();

        System.out.println( result);
    }

}