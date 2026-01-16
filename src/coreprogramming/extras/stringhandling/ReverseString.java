package coreprogramming.extras.stringhandling;

import java.util.Scanner;

class ReverseString {

    static String reverse(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--)
            rev += text.charAt(i);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println(reverse(text));
    }
}
