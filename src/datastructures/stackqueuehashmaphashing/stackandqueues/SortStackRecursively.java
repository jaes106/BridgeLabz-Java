package datastructures.stackqueuehashmaphashing.stackandqueues;

import java.util.Stack;

class StackSorter {

    static void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            insertSorted(s, x);
        }
    }

    static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertSorted(s, x);
        s.push(temp);
    }
}

public class SortStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(4);
        StackSorter.sort(s);
        System.out.println(s);
    }
}
