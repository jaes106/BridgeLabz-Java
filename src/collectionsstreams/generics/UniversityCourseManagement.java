package collectionsstreams.generics;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    abstract String evaluationType();
}

class ExamCourse extends CourseType {
    String evaluationType() {
        return "Exam Based";
    }
}

class AssignmentCourse extends CourseType {
    String evaluationType() {
        return "Assignment Based";
    }
}

class ResearchCourse extends CourseType {
    String evaluationType() {
        return "Research Based";
    }
}

class Course<T extends CourseType> {
    String name;
    T type;

    Course(String name, T type) {
        this.name = name;
        this.type = type;
    }
}

public class UniversityCourseManagement {

    static void displayCourses(List<? extends CourseType> list) {
        for (CourseType c : list)
            System.out.println(c.evaluationType());
    }

    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse());
        courses.add(new ResearchCourse());

        displayCourses(courses);
    }
}

