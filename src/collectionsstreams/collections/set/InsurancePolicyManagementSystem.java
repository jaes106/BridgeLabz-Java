package collectionsstreams.collections.set;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class InsurancePolicy {
    int policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    InsurancePolicy(int policyNumber, String policyHolderName,
                    LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public int hashCode() {
        return policyNumber;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsurancePolicy)) return false;
        InsurancePolicy p = (InsurancePolicy) o;
        return this.policyNumber == p.policyNumber;
    }
}

public class InsurancePolicyManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>(
                (a, b) -> a.expiryDate.equals(b.expiryDate)
                        ? a.policyNumber - b.policyNumber
                        : a.expiryDate.compareTo(b.expiryDate)
        );

        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for policy " + i);

            System.out.print("Policy Number: ");
            int policyNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Policy Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry Date (dd-MM-yyyy): ");
            LocalDate expiry = LocalDate.parse(sc.nextLine(), formatter);

            System.out.print("Coverage Type: ");
            String coverage = sc.nextLine();

            System.out.print("Premium Amount: ");
            double premium = sc.nextDouble();
            sc.nextLine();

            InsurancePolicy policy =
                    new InsurancePolicy(policyNumber, name, expiry, coverage, premium);

            hashSet.add(policy);
            linkedHashSet.add(policy);
            treeSet.add(policy);
        }

        System.out.println("\nAll Unique Policies:");
        for (InsurancePolicy p : hashSet)
            System.out.println(p.policyNumber + " " + p.policyHolderName);

        System.out.println("\nPolicies Expiring in Next 30 Days:");
        LocalDate today = LocalDate.now();
        for (InsurancePolicy p : treeSet)
            if (!p.expiryDate.isBefore(today)
                    && !p.expiryDate.isAfter(today.plusDays(30)))
                System.out.println(p.policyNumber + " " + p.expiryDate);

        System.out.print("\nEnter coverage type to search: ");
        String searchCoverage = sc.nextLine();
        for (InsurancePolicy p : hashSet)
            if (p.coverageType.equalsIgnoreCase(searchCoverage))
                System.out.println(p.policyNumber + " " + p.policyHolderName);

        long start, end;
        InsurancePolicy testPolicy =
                new InsurancePolicy(-1, "", LocalDate.now(), "", 0);

        start = System.nanoTime();
        hashSet.contains(testPolicy);
        end = System.nanoTime();
        System.out.println("\nHashSet search time: " + (end - start));

        start = System.nanoTime();
        linkedHashSet.contains(testPolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet search time: " + (end - start));

        start = System.nanoTime();
        treeSet.contains(testPolicy);
        end = System.nanoTime();
        System.out.println("TreeSet search time: " + (end - start));
    }
}
