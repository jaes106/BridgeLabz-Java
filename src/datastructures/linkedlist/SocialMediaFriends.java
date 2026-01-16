package datastructures.linkedlist;
class UserNode {
    int id;
    String name;
    UserNode next;

    UserNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SocialMediaFriends {
    UserNode head;

    void addUser(int id, String name) {
        UserNode u = new UserNode(id, name);
        u.next = head;
        head = u;
    }

    void displayUsers() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaFriends s = new SocialMediaFriends();
        s.addUser(1, "Raj");
        s.addUser(2, "Amit");
        s.displayUsers();
    }
}
