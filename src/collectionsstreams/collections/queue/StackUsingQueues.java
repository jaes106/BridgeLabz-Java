package collectionsstreams.collections.queue;

import java.util.*;

public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);
        while (!q1.isEmpty())
            q2.add(q1.remove());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        return q1.remove();
    }

    int top() {
        return q1.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingQueues s = new StackUsingQueues();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            s.push(sc.nextInt());

        System.out.println(s.pop());
    }
}
