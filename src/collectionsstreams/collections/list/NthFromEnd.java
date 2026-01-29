package collectionsstreams.collections.list;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.print("Enter N: ");
        int k = sc.nextInt();

        System.out.println("Nth from end: " + list.get(n - k));
    }
}
