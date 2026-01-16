package datastructures.linkedlist;
class TextState {
    String text;
    TextState prev, next;

    TextState(String text) {
        this.text = text;
    }
}

public class UndoRedoEditor {
    TextState current;

    void addState(String text) {
        TextState node = new TextState(text);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    void undo() {
        if (current.prev != null)
            current = current.prev;
    }

    public static void main(String[] args) {
        UndoRedoEditor e = new UndoRedoEditor();
        e.addState("Hello");
        e.addState("Hello World");
        e.undo();
        System.out.println(e.current.text);
    }
}
