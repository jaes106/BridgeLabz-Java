package datastructures.linkedlist;
class ProcessNode {
    int id, burst;
    ProcessNode next;

    ProcessNode(int id, int burst) {
        this.id = id;
        this.burst = burst;
    }
}

public class RoundRobinScheduler {
    ProcessNode head;

    void addProcess(int id, int burst) {
        ProcessNode node = new ProcessNode(id, burst);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    public static void main(String[] args) {
        RoundRobinScheduler r = new RoundRobinScheduler();
        r.addProcess(1, 5);
        r.addProcess(2, 3);
        System.out.println("Processes added");
    }
}
