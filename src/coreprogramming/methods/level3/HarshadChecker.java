package coreprogramming.methods.level3;

class HarshadChecker {

    static int[] getDigits(int number) {
        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    static boolean isHarshad(int number, int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return number % sum == 0;
    }

    static int[][] findFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    static void main(String[] args) {
        int number = 21;
        int[] digits = getDigits(number);

        System.out.println("Harshad Number: " + isHarshad(number, digits));

        int[][] freq = findFrequency(digits);
        for (int i = 0; i < 10; i++)
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }
}
