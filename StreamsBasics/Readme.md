Java 8 Streams – Student Example

Overview :

This program demonstrates basic operations using the Java 8 Stream API on a list of students.

The "Student" class is placed in a separate file to follow proper Java class structure.

---

Operations Performed :

1. Print all students
2. Filter students with marks greater than 70
3. Find student with highest marks
4. Count total number of students

---

Steps :

1. Create a "Student" class with attributes:

   - "id"
   - "name"
   - "marks"

2. Create a "List<Student>" and add several student objects.

3. Use "forEach()" to print all students.

4. Use "stream()" and "filter()" to get students with marks greater than 70.

5. Use "max()" with a comparator to find the student with the highest marks.

6. Use "count()" to calculate the total number of students in the list.

---

Files :

"Student.java" → Student model class

"StudentStreamExample.java" → Main program using Streams

---

Concepts Used :

- Java 8 Streams
- Lambda expressions
- Filtering data using "filter()"
- Aggregation operations ("max", "count")
