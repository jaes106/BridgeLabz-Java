package coreprogramming.string.level3;

import java.util.Scanner;

class CharacterFrequency {

    static int[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        int count = 0;
        for (int f : freq)
            if (f > 0) count++;

        int[][] result = new int[count][2];
        int index = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[][] freq = findFrequency(text);
        for (int[] row : freq)
            System.out.println((char) row[0] + " -> " + row[1]);
    }
}
