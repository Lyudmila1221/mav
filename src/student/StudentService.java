package student;

import java.util.Iterator;
import java.util.Set;

public class StudentService {
    public void removeLowGrades(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAverageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            student.promote();
        }
    }

    public void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}


