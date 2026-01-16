package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class TemperaturConversionFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double CelsiusResult = (Fahrenheit - 32) * (5.0 / 9);
        System.out.printf("Temperature in Celsius: %.2f°C", CelsiusResult);
    }
}

