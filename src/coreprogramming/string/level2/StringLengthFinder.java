package coreprogramming.string.level2;
import java.util.Scanner;

class StringLengthFinder {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Length (without length): " + findLength(text));
        System.out.println("Length (built-in): " + text.length());
    }
}
