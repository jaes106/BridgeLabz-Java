package objectorientedprogramming.classandobject.level2;

import java.util.Scanner;

class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, number, balance);

        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount: ");
        account.withdraw(sc.nextDouble());

        account.displayBalance();
    }
}
