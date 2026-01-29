package collectionsstreams.collections.set;

import java.util.*;

public class CheckSetsEqual {
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

        System.out.println(set1.equals(set2));
    }
}
