package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double Celsius = input.nextDouble();
        double FahrenheitResult = (Celsius * 9.0 / 5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f°F", FahrenheitResult);
    }
}

