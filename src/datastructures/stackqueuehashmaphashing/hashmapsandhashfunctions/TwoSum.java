package datastructures.stackqueuehashmaphashing.hashmapsandhashfunctions;

import java.util.HashMap;

public class TwoSum {
    static void find(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                System.out.println(map.get(need) + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        find(arr, 9);
    }
}
