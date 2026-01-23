package datastructures.algorithmsruntimeanalysis;

import java.util.*;

public class DataStructureSearchComparison {

    public static void main(String[] args) {
        int n = 100000;
        int target = n - 1;

        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            set.add(i);
            tree.add(i);
        }

        long start = System.nanoTime();
        for (int x : arr)
            if (x == target) break;
        System.out.println("Array Search: " + (System.nanoTime() - start));

        start = System.nanoTime();
        set.contains(target);
        System.out.println("HashSet Search: " + (System.nanoTime() - start));

        start = System.nanoTime();
        tree.contains(target);
        System.out.println("TreeSet Search: " + (System.nanoTime() - start));
    }
}
