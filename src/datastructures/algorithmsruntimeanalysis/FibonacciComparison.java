package datastructures.algorithmsruntimeanalysis;

public class FibonacciComparison {

    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    static int fibIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long start = System.nanoTime();
        fibRecursive(n);
        System.out.println("Recursive Time: " + (System.nanoTime() - start));

        start = System.nanoTime();
        fibIterative(n);
        System.out.println("Iterative Time: " + (System.nanoTime() - start));
    }
}

