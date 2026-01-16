package coreprogramming.controlflows.level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);
        System.out.printf("Your BMI is %.2f \n", bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
