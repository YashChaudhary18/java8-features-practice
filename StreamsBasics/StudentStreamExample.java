/* 1. Java 8 – Streams Basics
Create a Student list and perform:
● Print all students
● Filter students with marks > 70
● Find student with highest marks
● Count total students  */


package StreamsBasics;


import java.util.*;
import java.util.stream.*;

public class StudentStreamExample {

    public static void main(String[] args) {

        // Create student list
        List<Student> students = Arrays.asList(
                new Student(1, "Rahul", 65),
                new Student(2, "Aman", 85),
                new Student(3, "Priya", 72),
                new Student(4, "Neha", 90),
                new Student(5, "Arjun", 60)
        );

        // 1. Print all students
        System.out.println("All Students:");
        students.forEach(Student::display);

        // 2. Filter students with marks > 70
        System.out.println("\nStudents with marks > 70:");

        students.stream()
                .filter(s -> s.marks > 70)
                .sorted(Comparator.comparingInt(s -> s.marks))
                .forEach(Student::display);

        // 3. Find student with highest marks
        System.out.println("\nTop Student:");

        students.stream()
                .max(Comparator.comparingInt(s -> s.marks))
                .ifPresent(Student::display);

        // 4. Count total students
        System.out.println("\nTotal Students: " + students.size());

        // Extra: Top 3 students
        System.out.println("\nTop 3 Students:");

        students.stream()
                .sorted(Comparator.comparingInt((Student s) -> s.marks).reversed())
                .limit(3)
                .forEach(Student::display);
    }
}
