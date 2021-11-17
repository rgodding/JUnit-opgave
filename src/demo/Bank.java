package demo;

import java.util.Scanner;

public class Bank {

    public void start() {
        Scanner sc = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        System.out.print("type number: ");
        String accountNumber = sc.nextLine();
        System.out.print("type owner's name: ");
        String ownerName = sc.nextLine();
        Account account = new Account(accountNumber, ownerName);

        while (true) {
            System.out.println("""
                    Menu Commands:
                    
                    insert
                    withdraw
                    transfer
                    balance
                    details
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
                    break;
                case "details":
                    details();
                    break;
                default:
                    System.out.println("invalid command");
            }
        }
    }
    private void insert(){

    }
    private void withdraw(){

    }
    private void balance(){

    }
    private void details(){

    }
}
