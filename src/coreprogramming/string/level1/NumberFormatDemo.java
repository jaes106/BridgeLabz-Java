package coreprogramming.string.level1;
import java.util.Scanner;

class NumberFormatDemo {

    static void generateException(String text) {
        Integer.parseInt(text);
    }

    static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
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
