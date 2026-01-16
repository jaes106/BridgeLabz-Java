package coreprogramming.arrays.level1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }
        for (double height : heights) {
            sum += height;
        }
        double mean = sum / heights.length;
        System.out.printf("The mean of players height is %.2f", mean);
    }
}

