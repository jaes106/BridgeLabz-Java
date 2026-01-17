package datastructures.stackqueuehashmaphashing.stackandqueues;

import java.util.Queue;
import java.util.LinkedList;

class PetrolPump {
    int petrol, distance;

    PetrolPump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

public class CircularTour {
    static int findStart(PetrolPump[] p) {
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < p.length; i++) {
            surplus += p[i].petrol - p[i].distance;
            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }
        return surplus + deficit >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] p = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };
        System.out.println(findStart(p));
    }
}
