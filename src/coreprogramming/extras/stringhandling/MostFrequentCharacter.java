package coreprogramming.extras.stringhandling;
import java.util.Scanner;

class MostFrequentCharacter {

    static char mostFrequent(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char result = text.charAt(0);
        int max = freq[result];

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > max) {
                max = freq[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println("Most Frequent Character: " + mostFrequent(text));
    }
}
