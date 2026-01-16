package objectorientedprogramming.encapsulation;

interface Loanable {
    void applyForLoan();
}

abstract class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(int acc, double bal) {
        super(acc, bal);
    }

    double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan applied");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount(101, 10000);
        System.out.println(acc.calculateInterest());
    }
}
