package coreprogramming.methods.level2;
import java.util.Scanner;

class QuadraticRoots {

    static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta < 0) return new double[0];

        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{r1, r2};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0)
            System.out.println("No real roots");
        else if (roots.length == 1)
            System.out.println("Root: " + roots[0]);
        else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
    }
}
