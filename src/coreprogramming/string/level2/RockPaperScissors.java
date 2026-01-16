package coreprogramming.string.level2;

import java.util.Scanner;

class RockPaperScissors {

    static String computerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int) (Math.random() * 3)];
    }

    static int findWinner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("Rock") && comp.equals("Scissors") ||
                user.equals("Paper") && comp.equals("Rock") ||
                user.equals("Scissors") && comp.equals("Paper"))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            String user = sc.next();
            String comp = computerChoice();

            int result = findWinner(user, comp);
            if (result == 1) userWins++;
            if (result == -1) compWins++;

            System.out.println("Computer: " + comp);
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (userWins * 100.0 / games));
    }
}
