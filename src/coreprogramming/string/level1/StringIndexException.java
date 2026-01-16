package coreprogramming.string.level1;

import java.util.Scanner;

class StringIndexException {

    static void generateException(String text) {
        text.charAt(text.length());
    }

    static void handleException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception generated");
        }

        handleException(text);
    }
}
