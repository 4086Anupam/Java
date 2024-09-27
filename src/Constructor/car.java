package Constructor;

public class car {

    private String name;
    private int price;
    private int capacity;

   public car (String name) {
       this.name=name;

   }

   public car (String name, int price ){

       this.name=name;
       this.price=price;
   }
    public car (String name, int price,int  capacity){
       this.name=name;
       this.price=price;
       this.capacity=capacity;

    }
    void Display(){
        System.out.println(name);


    }
  void screen(){
    System.out.println(name);
    System.out.println(price);
 }
 void output() {
    System.out.println(name);
    System.out.println(price);
    System.out.println(capacity);
 }

}

class launch {
    public static void main(String[] args) {
        car obj = new car("TATA");
        car obj2 = new car("Mahindra ", 500000);
        car obj3 = new car("Volvo", 1000000, 500);

        obj.Display();
        obj2.screen();
        obj3.output();


    }
}