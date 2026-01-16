package coreprogramming.string.level3;
import java.util.Scanner;

class FrequencyUsingUnique {

    static char[] findUnique(String text) {
        char[] temp = new char[text.length()];
        int idx = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < idx; j++)
                if (temp[j] == c) found = true;

            if (!found)
                temp[idx++] = c;
        }

        char[] unique = new char[idx];
        for (int i = 0; i < idx; i++)
            unique[i] = temp[i];

        return unique;
    }

    static int countChar(String text, char c) {
        int count = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == c) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUnique(text);
        for (char c : unique)
            System.out.println(c + " -> " + countChar(text, c));
    }
}
