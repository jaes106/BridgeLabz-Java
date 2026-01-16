package objectorientedprogramming.inheritance;
class Account {
    void accountType() {
        System.out.println("Account");
    }
}

class Savings extends Account {
    void accountType() {
        System.out.println("Savings Account");
    }
}

class Current extends Account {
    void accountType() {
        System.out.println("Current Account");
    }
}

class FixedDeposit extends Account {
    void accountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        Account a1 = new Savings();
        Account a2 = new Current();
        Account a3 = new FixedDeposit();

        a1.accountType();
        a2.accountType();
        a3.accountType();
    }
}

