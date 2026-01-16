package coreprogramming.methods.level1;
import java.util.Scanner;

class AthleteRounds {

    static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 (meters): ");
        double a = input.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double b = input.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double c = input.nextDouble();

        System.out.println("Rounds required: " + calculateRounds(a, b, c));
    }
}
