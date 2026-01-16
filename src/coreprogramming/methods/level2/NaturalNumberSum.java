package coreprogramming.methods.level2;
import java.util.Scanner;

class NaturalNumberSum {

    static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number");
            return;
        }

        int sum1 = recursiveSum(n);
        int sum2 = formulaSum(n);

        System.out.println("Recursive Sum: " + sum1);
        System.out.println("Formula Sum: " + sum2);
    }
}
