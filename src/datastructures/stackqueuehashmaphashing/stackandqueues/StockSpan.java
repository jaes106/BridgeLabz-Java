package datastructures.stackqueuehashmaphashing.stackandqueues;

import java.util.Stack;

public class StockSpan {
    static void calculateSpan(int[] price) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.print("1 ");

        for (int i = 1; i < price.length; i++) {
            while (!s.isEmpty() && price[s.peek()] <= price[i])
                s.pop();

            int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(prices);
    }
}
