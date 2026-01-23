package datastructures.algorithmsruntimeanalysis;

import java.util.Arrays;

public class SortingComparison {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] l, int[] r) {
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length)
            arr[k++] = l[i] < r[j] ? l[i++] : r[j++];
        while (i < l.length) arr[k++] = l[i++];
        while (j < r.length) arr[k++] = r[j++];
    }

    public static void main(String[] args) {
        int[] arr = new int[5000];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

        int[] a1 = arr.clone();
        int[] a2 = arr.clone();

        long start = System.nanoTime();
        bubbleSort(a1);
        System.out.println("Bubble Sort: " + (System.nanoTime() - start));

        start = System.nanoTime();
        mergeSort(a2);
        System.out.println("Merge Sort: " + (System.nanoTime() - start));
    }
}
