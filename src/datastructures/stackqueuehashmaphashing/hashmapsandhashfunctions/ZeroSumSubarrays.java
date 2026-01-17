package datastructures.stackqueuehashmaphashing.hashmapsandhashfunctions;

import java.util.HashMap;

public class ZeroSumSubarrays {
    static boolean hasZeroSum(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int sum = 0;

        for (int x : arr) {
            sum += x;
            if (sum == 0 || map.containsKey(sum))
                return true;
            map.put(sum, true);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, -2, -2, 1};
        System.out.println(hasZeroSum(arr));
    }
}
