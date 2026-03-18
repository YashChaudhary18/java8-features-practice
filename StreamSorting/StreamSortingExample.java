/* 2. Java 8 – Stream Sorting
Sort employee list using streams:
● Sort by salary ascending
● Sort by salary descending */

package StreamSorting;


import java.util.*;

public class StreamSortingExample {

    public static void main(String[] args) {

        // Create employee list (with duplicates)
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", 50000),
                new Employee(2, "Aman", 70000),
                new Employee(3, "Priya", 45000),
                new Employee(4, "Neha", 80000),
                new Employee(5, "Arjun", 60000),
                new Employee(6, "Aman", 70000) // duplicate
        );

        // Display all employees
        System.out.println("All Employees:");
        employees.forEach(e -> e.display());

        //  Sort by salary ascending
        System.out.println("\nSorted by Salary (Ascending):");

        employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .forEach(e -> e.display());

        //  Sort by salary descending
        System.out.println("\nSorted by Salary (Descending):");

        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .forEach(e -> e.display());

        //  Remove duplicate employees (based on name + salary)
        System.out.println("\nDistinct Employees:");

        employees.stream()
                .filter(distinctByKey(e -> e.name + e.salary))
                .forEach(e -> e.display());

        //  Top 3 highest paid employees
        System.out.println("\nTop 3 Highest Paid Employees:");

        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .limit(3)
                .forEach(e -> e.display());

        //  Count employees with salary > 60000
        long count = employees.stream()
                .filter(e -> e.salary > 60000)
                .count();

        System.out.println("\nEmployees with salary > 60000: " + count);
    }

    // Utility method for distinct by key
    public static <T> java.util.function.Predicate<T> distinctByKey(
            java.util.function.Function<? super T, Object> keyExtractor) {

        Set<Object> seen = new HashSet<>();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
