package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of chocolates and number of children: ");
        int numOfChocolates = input.nextInt();
        int numOfChildren = input.nextInt();
        int chocPerChild = numOfChocolates / numOfChildren;
        int remainingChoc = numOfChocolates % numOfChildren;
        System.out.printf("The number of chocolates each child gets is %d and " +
                "the number of remaining chocolates are %d", chocPerChild, remainingChoc);
    }
}
