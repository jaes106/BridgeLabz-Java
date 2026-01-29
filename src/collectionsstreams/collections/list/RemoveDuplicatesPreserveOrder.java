package collectionsstreams.collections.list;
import java.util.*;

public class RemoveDuplicatesPreserveOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Set<Integer> set = new LinkedHashSet<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            set.add(sc.nextInt());

        System.out.println("After removing duplicates: " + set);
    }
}
