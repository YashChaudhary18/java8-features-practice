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
import java.util.stream.*;

public class MapOperationExample {

    public static void main(String[] args) {

        // Create list of names
        List<String> names = Arrays.asList("Java", "Spring", "Boot");

        // Convert names to lengths using map()
        List<Integer> lengths = names.stream()
                                     .map(name -> name.length())
                                     .collect(Collectors.toList());

        // Display results
        System.out.println("Names List: " + names);
        System.out.println("Lengths List: " + lengths);
    }
}