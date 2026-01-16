package coreprogramming.string.level3;
import java.util.Scanner;

class AnagramChecker {

    static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] freq = new int[256];

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        for (int f : freq)
            if (f != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String a = sc.nextLine();
        System.out.print("Enter second text: ");
        String b = sc.nextLine();

        System.out.println(areAnagrams(a, b));
    }
}
