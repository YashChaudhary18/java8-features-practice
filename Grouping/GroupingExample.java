/* 4. Java 8 – Grouping
Group students by marks using:
Collectors.groupingBy()
Example:
Marks 80 → students list
Marks 90 → students list */

package Grouping;

import java.util.*;

public class GroupingExample {

    public static void main(String[] args) {

        // Create student list
        List<Student> students = Arrays.asList(
                new Student(1, "Rahul", 80),
                new Student(2, "Aman", 90),
                new Student(3, "Priya", 80),
                new Student(4, "Neha", 90),
                new Student(5, "Arjun", 70)
        );

        // 1. Print all students
        System.out.println("All Students:");
        students.forEach(Student::display);

        // 2. Group students by marks
        Map<Integer, List<Student>> grouped =
                StudentService.groupByMarks(students);

        // 3. Display grouped result
        System.out.println("\nGrouped Students:");

        grouped.forEach((marks, list) -> {

            System.out.println("Marks " + marks + ":");

            list.forEach(Student::display);
        });

        //  Extra Improvements

        // Count students per marks
        System.out.println("\nCount by Marks:");

        grouped.forEach((marks, list) ->
                System.out.println("Marks " + marks + " → " + list.size())
        );
    }
}
