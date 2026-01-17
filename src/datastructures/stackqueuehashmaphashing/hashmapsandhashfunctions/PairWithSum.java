package datastructures.stackqueuehashmaphashing.hashmapsandhashfunctions;

import java.util.HashSet;

public class PairWithSum {
    static boolean exists(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(target - x))
                return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5};
        System.out.println(exists(arr, 10));
    }
}
