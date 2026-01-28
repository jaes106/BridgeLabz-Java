package collectionsstreams.generics;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    abstract String roleName();
}

class SoftwareEngineer extends JobRole {
    String roleName() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    String roleName() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    String roleName() {
        return "Product Manager";
    }
}

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }
}

public class ResumeScreeningSystem {

    static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole r : roles)
            System.out.println("Screening for: " + r.roleName());
    }

    public static void main(String[] args) {
        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(new SoftwareEngineer());
        pipeline.add(new DataScientist());

        screenResumes(pipeline);
    }
}
