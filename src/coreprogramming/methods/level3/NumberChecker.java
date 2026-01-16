package coreprogramming.methods.level3;
class NumberChecker {

    static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    static boolean isDuckNumber(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == number;
    }

    static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }

    static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }

    static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);

        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));

        int[] large = findLargestAndSecondLargest(digits);
        int[] small = findSmallestAndSecondSmallest(digits);

        System.out.println("Largest: " + large[0] + " Second Largest: " + large[1]);
        System.out.println("Smallest: " + small[0] + " Second Smallest: " + small[1]);
    }
}
