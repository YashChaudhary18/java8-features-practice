/* 5. Optional & Null Handling
Create program:
● Student object may be null
● Use Optional to avoid NullPointerException */


package NullHandling;

import java.util.Optional;

public class OptionalExample {

    // Simple Student class inside same file
    static class Student {

        int id;
        String name;
        int marks;

        Student(int id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
        }
    }

    public static void main(String[] args) {

        // Student object may be null
        Student student = null;

        // Wrap object using Optional
        Optional<Student> optionalStudent = Optional.ofNullable(student);

        // Check safely
        if (optionalStudent.isPresent()) {
            optionalStudent.get().display();
        } else {
            System.out.println("Student object is null");
        }

        // Another safe method
        optionalStudent.ifPresent(s -> s.display());
    }
}