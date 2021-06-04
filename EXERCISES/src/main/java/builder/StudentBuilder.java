package builder;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {
    private Student student;
    private List<String> courses;

    public StudentBuilder(String firstName, String lastName) {
        this.student = new Student(firstName, lastName);
    }

    public StudentBuilder withCourse(String course) {
        if (this.courses == null) {
            this.courses = new ArrayList<>();
            this.student.setCurses(this.courses);
        }
        this.courses.add(course);
        return this;
    }

    public StudentBuilder withCi(int ci) {
        this.student.setCi(ci);
        return this;
    }

    public Student build() {
        return this.student;
    }
}
