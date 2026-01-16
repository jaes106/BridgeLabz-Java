package datastructures.linkedlist;

class StudentNode {
    int roll;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int r, String n, int a, char g) {
        roll = r;
        name = n;
        age = a;
        grade = g;
    }
}

public class StudentLinkedList {
    StudentNode head;

    void addAtEnd(int r, String n, int a, char g) {
        StudentNode node = new StudentNode(r, n, a, g);
        if (head == null) {
            head = node;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    void deleteByRoll(int roll) {
        if (head == null) return;
        if (head.roll == roll) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void updateGrade(int roll, char g) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = g;
                return;
            }
            temp = temp.next;
        }
    }

    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addAtEnd(1, "Raj", 20, 'A');
        list.addAtEnd(2, "Amit", 21, 'B');
        list.updateGrade(2, 'A');
        list.display();
    }
}
