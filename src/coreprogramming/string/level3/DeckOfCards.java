package coreprogramming.string.level3;
import java.util.Scanner;

class DeckOfCards {

    static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        return deck;
    }

    static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int rand = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }

    static String[][] distribute(String[] deck, int players, int cards) {
        String[][] result = new String[players][cards];
        int index = 0;

        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                result[i][j] = deck[index++];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter cards per player: ");
        int cards = sc.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        String[][] game = distribute(deck, players, cards);

        for (int i = 0; i < game.length; i++) {
            System.out.println("Player " + (i + 1));
            for (String card : game[i])
                System.out.println(card);
            System.out.println();
        }
    }
}


