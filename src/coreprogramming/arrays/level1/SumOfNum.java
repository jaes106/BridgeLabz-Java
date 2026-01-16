package coreprogramming.arrays.level1;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number: ");
            double value = input.nextInt();
            if (index == 10) {
                break;
            } else if (value <= 0) {
                break;
            }
            arr[index] = value;
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println("The numbers are " + arr[i]);
            total += arr[i];
        }
        System.out.println("The sum of numbers is " + total);
    }
}
