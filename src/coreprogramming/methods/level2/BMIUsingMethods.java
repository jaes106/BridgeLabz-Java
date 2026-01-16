package coreprogramming.methods.level2;
import java.util.Scanner;

class BMIUsingMethods {

    static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    static String[] determineStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = input.nextDouble();
        }

        calculateBMI(data);
        String[] status = determineStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println("BMI: " + data[i][2] + " Status: " + status[i]);
        }
    }
}
