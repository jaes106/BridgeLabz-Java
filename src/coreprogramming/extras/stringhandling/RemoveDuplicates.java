package coreprogramming.extras.stringhandling;
import java.util.Scanner;

class RemoveDuplicates {

    static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println(removeDuplicates(text));
    }
}
