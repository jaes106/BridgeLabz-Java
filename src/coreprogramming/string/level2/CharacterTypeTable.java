package coreprogramming.string.level2;

import java.util.Scanner;

class CharacterTypeTable {

    static String checkCharacter(char c) {
        if (c >= 'A' && c <= 'Z') c = (char) (c + 32);

        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyzeText(String text) {
        String[][] table = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            table[i][0] = String.valueOf(text.charAt(i));
            table[i][1] = checkCharacter(text.charAt(i));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] table = analyzeText(text);

        System.out.println("Char\tType");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
