package NullHandling;

import java.util.Optional;

public class StudentService {

    // Return Optional<Student>
    public static Optional<Student> getStudent(boolean isPresent) {

        if (isPresent) {
            return Optional.of(new Student(1, "Rahul", 85));
        } else {
            return Optional.empty();
        }
    }
}