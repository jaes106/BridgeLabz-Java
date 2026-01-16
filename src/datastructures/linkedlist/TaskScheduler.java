package datastructures.linkedlist;

class TaskNode {
    int id;
    String name;
    TaskNode next;

    TaskNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class TaskScheduler {
    TaskNode head;

    void addTask(int id, String name) {
        TaskNode node = new TaskNode(id, name);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler t = new TaskScheduler();
        t.addTask(1, "Code");
        t.addTask(2, "Test");
        t.displayTasks();
    }
}
