package collectionsstreams.collections.list;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();

        k %= n;
        Collections.rotate(list, -k);

        System.out.println("Rotated List: " + list);
    }
}

