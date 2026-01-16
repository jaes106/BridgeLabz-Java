package coreprogramming.programmingelements.level1;

public class Profit {
    public static void main(String[] args) {
        int cost = 129;
        int salePrice = 191;
        int profit = salePrice - cost;
        double profitPercentage = (double) profit * 100 / cost;
        System.out.printf("The Cost Price is INR 129 and Selling Prince is INR 191.\n" +
                "The Profit is INR %d and the Profit Percentage is %.2f", profit, profitPercentage);
    }
}
