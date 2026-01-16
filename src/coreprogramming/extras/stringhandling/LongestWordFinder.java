package coreprogramming.extras.stringhandling;
import java.util.Scanner;

class LongestWordFinder {

    static String findLongest(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String w : words)
            if (w.length() > longest.length())
                longest = w;

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.println(findLongest(sentence));
    }
}
