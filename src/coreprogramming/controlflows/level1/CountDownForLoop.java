package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class CountDownForLoop {
    public static void main(String[] args) {
        System.out.print("Enter the countdown No: ");
        Scanner input = new Scanner(System.in);

        for (int count = input.nextInt(); count > 0; count--) {
            System.out.println(count);
        }
    }
}
