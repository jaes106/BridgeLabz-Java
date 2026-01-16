package objectorientedprogramming.classandobject.level2;

import java.util.Scanner;

class PalindromeChecker {

    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public void displayResult() {
        System.out.println(isPalindrome());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();
    }
}
