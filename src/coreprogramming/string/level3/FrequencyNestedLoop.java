package coreprogramming.string.level3;

import java.util.Scanner;

class FrequencyNestedLoop {

    static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int f : freq)
            if (f > 0) count++;

        String[] result = new String[count];
        int idx = 0;

        for (int i = 0; i < freq.length; i++)
            if (freq[i] > 0)
                result[idx++] = chars[i] + " -> " + freq[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);
        for (String s : result)
            System.out.println(s);
    }
}
