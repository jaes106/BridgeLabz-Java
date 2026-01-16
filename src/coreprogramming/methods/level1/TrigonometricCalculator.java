package coreprogramming.methods.level1;
import java.util.Scanner;

class TrigonometricCalculator {

    static double[] calculateTrigonometricFunctions(double angle) {
        double radian = Math.toRadians(angle);
        return new double[]{
                Math.sin(radian),
                Math.cos(radian),
                Math.tan(radian)
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + values[0]);
        System.out.println("Cosine: " + values[1]);
        System.out.println("Tangent: " + values[2]);
    }
}
