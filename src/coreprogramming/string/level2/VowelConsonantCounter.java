package coreprogramming.string.level2;

import java.util.Scanner;

class VowelConsonantCounter {

    static String checkCharacter(char c) {
        if (c >= 'A' && c <= 'Z') c = (char) (c + 32);

        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            return "Consonant";
        }
        return "NotLetter";
    }

    static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacter(text.charAt(i));
            if (type.equals("Vowel")) vowels++;
            if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
