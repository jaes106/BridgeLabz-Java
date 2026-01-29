package collectionsstreams.collections.list;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
