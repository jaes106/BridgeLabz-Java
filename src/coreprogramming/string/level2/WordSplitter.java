package coreprogramming.string.level2;
import java.util.Scanner;

class WordSplitter {

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

    static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ') count++;

        int[] spaceIndex = new int[count - 1];
        int k = 0;

        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ') spaceIndex[k++] = i;

        String[] words = new String[count];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }
        words[count - 1] = text.substring(start);

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manual = splitWords(text);
        String[] builtIn = text.split(" ");

        System.out.println("Result matches: " + compareArrays(manual, builtIn));
    }
}
