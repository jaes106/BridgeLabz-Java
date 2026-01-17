package datastructures.stackqueuehashmaphashing.hashmapsandhashfunctions;

import java.util.LinkedList;

class Entry {
    int key, value;
    Entry(int k, int v) {
        key = k;
        value = v;
    }
}

class SimpleHashMap {
    LinkedList<Entry>[] table = new LinkedList[10];

    void put(int key, int value) {
        int index = key % 10;
        if (table[index] == null)
            table[index] = new LinkedList<>();
        table[index].add(new Entry(key, value));
    }

    int get(int key) {
        int index = key % 10;
        if (table[index] != null)
            for (Entry e : table[index])
                if (e.key == key)
                    return e.value;
        return -1;
    }
}

public class CustomHashMapApp {
    public static void main(String[] args) {
        SimpleHashMap map = new SimpleHashMap();
        map.put(1, 100);
        System.out.println(map.get(1));
    }
}
