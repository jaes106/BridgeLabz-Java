package coreprogramming.extras.stringhandling;

import java.util.Scanner;

class LexicographicalCompare {

    static int compare(String a, String b) {
        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i))
                return a.charAt(i) - b.charAt(i);
        }
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        int result = compare(a, b);

        if (result < 0)
            System.out.println(a + " comes before " + b);
        else if (result > 0)
            System.out.println(a + " comes after " + b);
        else
            System.out.println("Both strings are equal");
    }
}
