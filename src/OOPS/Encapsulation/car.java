package OOPS.Encapsulation;

public class car {

    private String name;
    private int buy;
    private String color;

    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }

    public void setBuy (int buy){
        this.buy=buy;

    }

    public int getBuy(){
        return buy;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

}

class Information {

    public static void main(String[] args) {

       car obj = new car();
       obj.setName("TATA");
       obj.setBuy(500000);
       obj.setColor("Blue");

       String car=obj.getName();
       int car_buy=obj.getBuy();
       String color=obj.getColor();


        System.out.println(car + " " + car_buy + " " + color);




    }



}
