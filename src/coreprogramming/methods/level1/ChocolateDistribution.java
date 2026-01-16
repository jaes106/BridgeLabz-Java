package coreprogramming.methods.level1;
import java.util.Scanner;

class ChocolateDistribution {

    static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int children = input.nextInt();

        int[] result = distributeChocolates(chocolates, children);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
