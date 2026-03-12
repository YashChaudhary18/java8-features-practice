/* 2. Java 8 – Stream Sorting
Sort employee list using streams:
● Sort by salary ascending
● Sort by salary descending */

package StreamSorting;


import java.util.*;

public class StreamSortingExample {

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rahul", 50000));
        employees.add(new Employee(2, "Aman", 70000));
        employees.add(new Employee(3, "Priya", 45000));
        employees.add(new Employee(4, "Neha", 80000));
        employees.add(new Employee(5, "Arjun", 60000));

        // Display all employees
        System.out.println("All Employees:");
        employees.forEach(e -> e.display());

        // Sort by salary ascending
        System.out.println("\nEmployees sorted by salary (Ascending):");

        employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .forEach(e -> e.display());

        // Sort by salary descending
        System.out.println("\nEmployees sorted by salary (Descending):");

        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .forEach(e -> e.display());
    }
}