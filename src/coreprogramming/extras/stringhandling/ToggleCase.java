package coreprogramming.extras.stringhandling;
import java.util.Scanner;

class ToggleCase {

    static String toggle(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z')
                result += (char)(c + 32);
            else if (c >= 'a' && c <= 'z')
                result += (char)(c - 32);
            else
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println(toggle(text));
    }
}
