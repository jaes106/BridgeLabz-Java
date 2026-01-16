package objectorientedprogramming.inheritance;

class Course {
    String name = "Java";
}

class OnlineCourse extends Course {
    String platform = "Zoom";
}

class PaidCourse extends OnlineCourse {
    int fee = 5000;
}

public class CourseHierarchy {
    public static void main(String[] args) {
        PaidCourse p = new PaidCourse();
        System.out.println(p.name);
        System.out.println(p.platform);
        System.out.println(p.fee);
    }
}
