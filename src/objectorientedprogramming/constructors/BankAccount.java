package objectorientedprogramming.constructors;

class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int a, String h, double b) {
        accountNumber = a;
        accountHolder = h;
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int a, String h, double b) {
        super(a, h, b);
    }

    void display() {
        System.out.println(accountNumber + " " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Raj", 5000);
        s.display();
    }
}
