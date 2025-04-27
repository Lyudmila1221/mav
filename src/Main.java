import phonebook.PhoneBook;
import student.Student;
import student.StudentService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>(Arrays.asList(
                new Student("Иванов", "A1", 1, Arrays.asList(4, 3, 5)),
                new Student("Петров", "B2", 2, Arrays.asList(2, 2, 3)),
                new Student("Сидоров", "A1", 1, Arrays.asList(5, 5, 5))
        ));

        StudentService studentService = new StudentService();
        studentService.removeLowPerformers(students);
        studentService.promoteStudents(students);
        studentService.printStudentsByCourse(students, 2);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "12345");
        phoneBook.add("Иванов", "67890");
        phoneBook.add("Петров", "54321");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
    }
}
