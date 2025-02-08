package OOPS.Encapsulation;

public class Bankaccount {
    private long accountNumber;

    private double  balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposite (double amount){

        if (amount>0){
            balance +=amount;
            System.out.println("Deposit balance " + amount);
        }
        else {
            System.out.println("Invalid Deposit amount ");
        }

    }

    public void withdraw(double amount){
   if (amount >0 && amount<=balance){
       balance -=amount;
       System.out.println("withdraw account " +amount );
   }
   else {
       System.out.println("Invalid amount");

   }
    }

}
 class Bank {

    public static void main(String[] args) {
   Bankaccount obj =new Bankaccount();
   obj .setAccountNumber(148002);
   obj.deposite(5000);
   obj.withdraw(500);

        System.out.println(obj.getBalance());
        System.out.println(obj.getAccountNumber());

    }

}
