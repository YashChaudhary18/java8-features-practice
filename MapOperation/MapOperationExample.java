/* 3. Java 8 – Map Operation
Given:
List<String> names
Convert to:
List<Integer> length
Example:
["Java","Spring","Boot"]
→ [4,6,4] */

package MapOperation;
import java.util.*;

public class MapOperationExample {

    public static void main(String[] args) {

        // Create list of names
        List<String> names = Arrays.asList(
                "Java", "Spring", "Boot", "Java", "API"
        );

        // 1. Print original list
        System.out.println("Original Names:");
        names.forEach(System.out::println);

        // 2. Convert names to lengths
        List<Integer> lengths = NameProcessor.getNameLengths(names);

        System.out.println("\nName Lengths:");
        lengths.forEach(System.out::println);

        //  Extra Improvements

        // 3. Distinct names
        System.out.println("\nDistinct Names:");

        names.stream()
                .distinct()
                .forEach(System.out::println);

        // 4. Sorted names
        System.out.println("\nSorted Names:");

        names.stream()
                .sorted()
                .forEach(System.out::println);

        // 5. Count names starting with 'J'
        long count = names.stream()
                .filter(name -> name.startsWith("J"))
                .count();

        System.out.println("\nNames starting with 'J': " + count);
    }
}
