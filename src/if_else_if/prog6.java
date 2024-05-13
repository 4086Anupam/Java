package if_else_if;

public class prog6 {

    public static <string> void main(String[] args) {

        // comment
        int month=4;

        string season ;

        if (month==1|| month==2||month==3) {
            season = (string) "winter";
        }
        else if (month==4||month==5||month==6) {


            season=(string) "Spring";
        }
else {
    season=(string) "Automn";
        }
        System.out.println(season);
    }


}
