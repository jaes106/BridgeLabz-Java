package coreprogramming.methods.level1;
import java.util.Scanner;

class WindChillCalculator {

    static double calculateWindChill(double temperature, double windSpeed) {
        return 13.12 + 0.6215 * temperature
                - 11.37 * Math.pow(windSpeed, 0.16)
                + 0.3965 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();

        System.out.println("Wind Chill Temperature: " +
                calculateWindChill(temperature, windSpeed));
    }
}
