package OOPS.Encapsulation;

public class Animale {
  private String name;
  private String color;
  private String breed;
  private int age;

  public void wagTail(){

      System.out.println("Dog wag their tails");
  }

  public void eating (){

      System.out.println("Dog Eating ");

  }

  public void barking (){

      System.out.println("Dog bark");
  }

  public void setName(String name){

      this.name=name;

  }

  public String getName(){
      return name;
  }

  public void setColor(String color){
      this.color=color;
  }

  public String getColor(){
      return color;
  }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class TEST1{

    public static void main(String[] args) {

      Animale Dog = new Animale();
      Dog.setAge(20);
        System.out.println(Dog.getAge());

    }
}
