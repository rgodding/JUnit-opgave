package demo;

import java.util.Scanner;

public class Bank {

    Scanner scDouble = new Scanner(System.in);
    Account account;
    Account dummyAccount = new Account("123","123");

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.print("type number: ");
        String accountNumber = sc.nextLine();
        System.out.print("type owner's name: ");
        String ownerName = sc.nextLine();
        account = new Account(accountNumber, ownerName);

        while (true) {
            System.out.println("""
                    Menu Commands:
                    
                    insert
                    withdraw
                    transfer
                    balance
                    details
                    test
                    """);
            System.out.print("type command: ");
            switch (sc.nextLine()) {
                case "insert":
                    insert();
                    break;
                case "withdraw":
                    withdraw();
                    break;
                case "balance":
                    balance();
                    break;
                case "transfer":
                    transfer();
                    break;
                case "details":
                    details();
                    break;
                case "test":
                    test();
                    break;
                default:
                    System.out.println("invalid command");
            }
        }
    }

    private void insert(){
        System.out.print("how much do you want to insert?: ");
        double input = scDouble.nextDouble();
        account.insert(input);
    }
    private void withdraw(){
        System.out.print("how much do you want to withdraw?: ");
        double input = scDouble.nextDouble();
        if(account.withdraw(input)==-1){
            System.out.println(input + " can not be withdrawn from the account " + account.getAccountNumber());
        } else {
            System.out.println(input + " has been withdrawn from the account " + account.getAccountNumber());
        }

    }
    private void transfer(){
        System.out.println("How much do you wish to transfer?");
        double input = scDouble.nextDouble();
        System.out.println("Which account do you wish to transfer to?");

        System.out.println("programting");
        dummyAccount = account.transfer(input,dummyAccount);
    }
    private void balance(){
        System.out.println(account.getBalance());
    }
    private void details(){
        System.out.println(account);
    }
    private void test(){
        System.out.println(dummyAccount);
    }
}
