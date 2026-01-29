package collectionsstreams.collections.queue;

import java.util.*;

public class CircularBuffer {
    int[] buffer;
    int index = 0;
    int size;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    void insert(int x) {
        buffer[index % size] = x;
        index++;
    }

    void display() {
        int start = Math.max(0, index - size);
        for (int i = start; i < index; i++)
            System.out.print(buffer[i % size] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter buffer size: ");
        int size = sc.nextInt();

        CircularBuffer cb = new CircularBuffer(size);

        System.out.print("Enter number of insertions: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            cb.insert(sc.nextInt());
            cb.display();
        }
    }
}
