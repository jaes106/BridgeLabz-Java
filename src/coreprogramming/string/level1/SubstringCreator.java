package coreprogramming.string.level1;
import java.util.Scanner;

class SubstringCreator {

    static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++)
            result += text.charAt(i);
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manual = createSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("Manual substring: " + manual);
        System.out.println("Built-in substring: " + builtIn);
        System.out.println("Are equal: " + compareStrings(manual, builtIn));
    }
}
