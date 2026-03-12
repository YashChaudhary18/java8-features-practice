/* 4. Java 8 – Grouping
Group students by marks using:
Collectors.groupingBy()
Example:
Marks 80 → students list
Marks 90 → students list */\

package Grouping;

import java.util.*;
import java.util.stream.*;

public class GroupingExample {

    public static void main(String[] args) {

        // Create student list
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 80));
        students.add(new Student(2, "Aman", 90));
        students.add(new Student(3, "Priya", 80));
        students.add(new Student(4, "Neha", 90));
        students.add(new Student(5, "Arjun", 70));

        // Display all students
        System.out.println("All Students:");
        students.forEach(s -> s.display());

        // Group students by marks
        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.marks));

        // Display grouped result
        System.out.println("\nStudents grouped by marks:");

        grouped.forEach((marks, studentList) -> {

            System.out.println("Marks " + marks + " →");

            studentList.forEach(s -> 
                System.out.println("   " + s.name)
            );
        });
    }
}