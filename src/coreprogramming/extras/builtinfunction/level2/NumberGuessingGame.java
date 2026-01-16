package coreprogramming.extras.builtinfunction.level2;

import java.util.Scanner;

class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        System.out.println("Think of a number between 1 and 100");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter high / low / correct: ");
            feedback = sc.next();

            if (feedback.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }
}
