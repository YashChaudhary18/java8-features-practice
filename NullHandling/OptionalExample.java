/* 5. Optional & Null Handling
Create program:
● Student object may be null
● Use Optional to avoid NullPointerException */


package NullHandling;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // Case 1: Student exists
        Optional<Student> student1 = StudentService.getStudent(true);

        System.out.println("Case 1:");

        student1.ifPresent(Student::display);

        // Case 2: Student is null
        Optional<Student> student2 = StudentService.getStudent(false);

        System.out.println("\nCase 2:");

        Student result = student2.orElse(
                new Student(0, "Default Student", 0)
        );

        result.display();

        //  Advanced Usage

        // orElseThrow example
        try {
            Student s = student2.orElseThrow(() ->
                    new RuntimeException("Student not found"));

            s.display();

        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
    }
}
