package coreprogramming.string.level1;
import java.util.Scanner;

class UppercaseConverter {

    static String toUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z')
                result += (char) (c - 32);
            else
                result += c;
        }
        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = toUpper(text);
        String builtIn = text.toUpperCase();

        System.out.println("Result matches: " + compare(manual, builtIn));
    }
}
