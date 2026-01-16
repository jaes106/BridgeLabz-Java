package coreprogramming.extras.stringhandling;
import java.util.Scanner;

class RemoveSpecificCharacter {

    static String removeChar(String text, char ch) {
        String result = "";

        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != ch)
                result += text.charAt(i);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println(removeChar(text, ch));
    }
}
