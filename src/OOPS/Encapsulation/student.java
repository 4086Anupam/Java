package OOPS.Encapsulation;

public class student {

    private int age;
   private String name;
   private int roll;

  public  void  setAge (int age ){ // Setters method
      this.age =age;

   }
   public int getAge(){  // Getters method
      return age;
   }

   public void setName(String name){
      this.name=name;
   }

   public String getName(){
      return name;
   }

   public void setRoll(int roll){
      this.roll=roll;
   }
   public int getRoll(){
      return roll;
   }


   void  show(){
       System.out.println(name + " " + age);
    }


}

//  out side of the world
class demo {

    public static void main(String[] args) {

        student obj = new student();
        obj.setAge(20);
        obj.setName("Anupam");
        obj.setRoll(07);
        student obj2=new student();
        obj2.setName("Surya");
        obj2.setAge(20);
        obj2.setRoll(121);
       String myName2= obj2.getName();
       int myAge2=obj2.getAge();
       int myAge =obj.getAge();
       int myRoll=obj.getRoll();
       int myRoll1=obj2.getRoll();
       String myName=obj.getName();
        System.out.println(myAge + " " + myName +" " +myRoll);
        System.out.println(myName2 + " " + myAge2 + " " +myRoll1);

    }


}
