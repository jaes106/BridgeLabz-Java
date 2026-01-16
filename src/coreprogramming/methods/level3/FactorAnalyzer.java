package coreprogramming.methods.level3;
class FactorAnalyzer {

    static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;

        return factors;
    }

    static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++)
            if (number % i == 0) sum += i;
        return sum;
    }

    static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 145;

        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }
}
