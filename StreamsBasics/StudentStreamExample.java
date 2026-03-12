/* 1. Java 8 – Streams Basics
Create a Student list and perform:
● Print all students
● Filter students with marks > 70
● Find student with highest marks
● Count total students  */


package StreamsBasics;


import java.util.*;

public class StudentStreamExample {

    public static void main(String[] args) {

        // Create student list
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 65));
        students.add(new Student(2, "Aman", 85));
        students.add(new Student(3, "Priya", 72));
        students.add(new Student(4, "Neha", 90));
        students.add(new Student(5, "Arjun", 60));

        // 1. Print all students
        System.out.println("All Students:");
        students.forEach(s -> s.display());

        // 2. Filter students with marks > 70
        System.out.println("\nStudents with marks > 70:");

        students.stream()
                .filter(s -> s.marks > 70)
                .forEach(s -> s.display());

        // 3. Find student with highest marks
        Optional<Student> topStudent =
                students.stream()
                        .max((s1, s2) -> s1.marks - s2.marks);

        System.out.println("\nStudent with Highest Marks:");
        topStudent.ifPresent(s -> s.display());

        // 4. Count total students
        long total = students.stream().count();

        System.out.println("\nTotal Students: " + total);
    }
}