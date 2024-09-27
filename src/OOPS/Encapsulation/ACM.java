package OOPS.Encapsulation;

public class ACM {

  private  int Ph_number;
  private  String Name;
  private String Domain;

  public void setPh_number(int Ph_number){
      this.Ph_number=Ph_number;
  }
 public void setName(String Name){
      this.Name=Name;
 }

 public void setDomain(String Domain){
      this.Domain=Domain;
 }


 public String getName(){
      return Name;
 }

    public String getDomain(){
        return Domain;
    }
    public int getPh_number(){
        return Ph_number;
    }


}

 class user {
    public static void main(String[] args) {
        ACM obj = new ACM();
        obj.setPh_number(98);
        obj.setName("Anupam");
        obj.setDomain("Volunteer");

        int number = obj.getPh_number();
        String name = obj.getName();
        String domain = obj.getDomain();

        System.out.println("My name is " + name+" " + "I am" +" "+  domain +" " + "my ph mynumber " +" "+ number);

    }
}