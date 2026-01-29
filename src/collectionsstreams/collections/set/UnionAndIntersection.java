package collectionsstreams.collections.set;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++)
            set1.add(sc.nextInt());

        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++)
            set2.add(sc.nextInt());

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println(union);
        System.out.println(intersection);
    }
}
