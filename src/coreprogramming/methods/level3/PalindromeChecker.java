package coreprogramming.methods.level3;
class PalindromeChecker {

    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    static boolean isPalindrome(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        int[] digits = NumberChecker.getDigits(number);
        int[] reversed = reverseArray(digits);

        System.out.println("Palindrome: " + isPalindrome(digits, reversed));
        System.out.println("Duck Number: " + isDuck(digits));
    }
}
