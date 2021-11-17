package demo;

public class Account {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        balance = 0;
    }

    public void insert(double amount){
        balance += amount;
    }

    public double withdraw(double amount){
       if(balance-amount<0){
           return -1;
       } else {
           balance -= amount;
           return amount;
       }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber + "\nOwner: " + ownerName + "\n" +
                "Balance: " + balance + "kr.";
    }
}
