package coreprogramming.arrays.level1;

import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factIndex = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                if (factIndex == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factIndex; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[factIndex] = i;
                factIndex += 1;
            }
        }
        System.out.println("The factors of the number "+number+" are :");
        for (int i = 0; i < factIndex; i++) {
            System.out.print(factors[i]+ " ");
        }
    }
}
