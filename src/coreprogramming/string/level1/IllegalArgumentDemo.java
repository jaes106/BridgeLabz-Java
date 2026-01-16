package coreprogramming.string.level1;
import java.util.Scanner;

class IllegalArgumentDemo {

    static void generateException(String text) {
        text.substring(5, 2);
    }

    static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
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
