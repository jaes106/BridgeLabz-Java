package coreprogramming.methods.level1;
import java.util.Scanner;

class SimpleInterestCalculator {

    static double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter time: ");
        double time = input.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}

