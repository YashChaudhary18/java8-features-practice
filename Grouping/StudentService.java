package Grouping;

import java.util.*;
import java.util.stream.*;

public class StudentService {

    // Group students by marks
    public static Map<Integer, List<Student>> groupByMarks(List<Student> students) {

        return students.stream()
                .collect(Collectors.groupingBy(s -> s.marks));
    }
}