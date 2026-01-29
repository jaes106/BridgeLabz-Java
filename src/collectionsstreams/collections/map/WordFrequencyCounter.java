package collectionsstreams.collections.map;

import java.util.*;
import java.io.*;

public class WordFrequencyCounter {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("src/collectionsstreams/collections/map/input.txt"));
        Map<String, Integer> map = new HashMap<>();

        String line;
        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-z ]", "");
            for (String word : line.split("\\s+")) {
                if (!word.isEmpty())
                    map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        br.close();

        System.out.println(map);
    }
}
