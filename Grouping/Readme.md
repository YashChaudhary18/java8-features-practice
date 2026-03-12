Java 8 Stream Grouping Example

Overview :

This program demonstrates how to group students by marks using Java 8 Streams and "Collectors.groupingBy()".

Students with the same marks are grouped together.

Example:

Marks 80 → [Rahul, Priya]
Marks 90 → [Aman, Neha]

---

Steps :

1. Create a "Student" class with attributes:

   - id
   - name
   - marks

2. Create a "List<Student>" and add student objects.

3. Display all students.

4. Convert the list into a stream using "stream()".

5. Use "Collectors.groupingBy()" to group students based on marks.

6. Store the result in a "Map<Integer, List<Student>>".

7. Display the grouped students.

---

Concepts Used :

- Java 8 Streams
- Collectors.groupingBy()
- Lambda expressions
- Map and List collections
