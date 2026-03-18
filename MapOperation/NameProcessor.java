package MapOperation;

// Utility class for name processing

import java.util.*;
import java.util.stream.*;

public class NameProcessor {

    // Convert names to lengths
    public static List<Integer> getNameLengths(List<String> names) {

        return names.stream()
                .map(String::length)   // method reference
                .collect(Collectors.toList());
    }
}