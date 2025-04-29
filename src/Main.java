import phonebook.PhoneBook;
import student.Student;
import student.StudentService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Ivanov", "A1", 1, Arrays.asList(4, 3, 5)));
        students.add(new Student("Petrov", "A1", 1, Arrays.asList(2, 2, 2)));
        students.add(new Student("Sidorov", "A1", 1, Arrays.asList(3, 3, 4)));

        StudentService service = new StudentService();
        service.removeLowGrades(students);
        service.promoteStudents(students);
        service.printStudents(students, 2);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "123456789");
        phoneBook.add("Ivanov", "987654321");
        phoneBook.add("Petrov", "555555555");

        System.out.println("Phones for Ivanov: " + phoneBook.get("Ivanov"));
    }
}