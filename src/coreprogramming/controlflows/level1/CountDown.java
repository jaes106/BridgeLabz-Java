package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        System.out.print("Enter the countdown No: ");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        while (count > 0) {
            System.out.println(count);
            count--;
        }
    }
}
