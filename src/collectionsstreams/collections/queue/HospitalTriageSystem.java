package collectionsstreams.collections.queue;

import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> pq =
                new PriorityQueue<>((a, b) -> b.severity - a.severity);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter patient name: ");
            String name = sc.next();
            System.out.print("Enter severity: ");
            int severity = sc.nextInt();
            pq.add(new Patient(name, severity));
        }

        while (!pq.isEmpty())
            System.out.println(pq.remove().name);
    }
}
