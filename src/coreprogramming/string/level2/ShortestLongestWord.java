package coreprogramming.string.level2;
import java.util.Scanner;

class ShortestLongestWord {

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

        String[] words = new String[count];
        int index = 0;
        String word = "";

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }
        words[index] = word;
        return words;
    }

    static int[] findShortestLongest(String[] words) {
        int min = 0, max = 0;
        for (int i = 1; i < words.length; i++) {
            if (findLength(words[i]) < findLength(words[min])) min = i;
            if (findLength(words[i]) > findLength(words[max])) max = i;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        int[] result = findShortestLongest(words);

        System.out.println("Shortest word: " + words[result[0]]);
        System.out.println("Longest word: " + words[result[1]]);
    }
}
