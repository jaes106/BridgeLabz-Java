package coreprogramming.controlflows.level2;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = "Amar";
        String name2 = "Akbar";
        String name3 = "Anthony";
        System.out.print("Enter three ages: ");
        int age1 = input.nextInt();
        int age2 = input.nextInt();
        int age3 = input.nextInt();
        System.out.print("Enter three Heights: ");
        int height1 = input.nextInt();
        int height2 = input.nextInt();
        int height3 = input.nextInt();
        String youngestName = name1;
        int youngestAge = age1;
        if (age2 < youngestAge) {
            youngestAge = age2;
            youngestName = name2;
        }
        if (age3 < youngestAge) {
            youngestAge = age3;
            youngestName = name3;
        }
        String tallestName = name1;
        int tallestHeight = height1;
        if (height2 > tallestHeight) {
            tallestHeight = height2;
            tallestName = name2;
        }
        if (height3 > tallestHeight) {
            tallestHeight = height3;
            tallestName = name3;
        }
        System.out.println("Youngest: " + youngestName + ", Age: " + youngestAge);
        System.out.println("Tallest: " + tallestName + ", Height: " + tallestHeight);
    }
}
