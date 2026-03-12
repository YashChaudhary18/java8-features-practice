Java 8 Stream Sorting Example

Overview :

This program demonstrates sorting a list of employees using the Java 8 Stream API.

Two types of sorting are performed:

- Sort employees by salary in ascending order
- Sort employees by salary in descending order

---

Steps :

1. Create an "Employee" class with attributes:

   - "id"
   - "name"
   - "salary"

2. Create a "List<Employee>" and add multiple employee objects.

3. Display all employees using "forEach()".

4. Convert the list into a stream using "stream()".

5. Use "sorted()" with "Comparator.comparingDouble()" to sort employees by salary in ascending order.

6. Use "sorted()" with "Comparator.comparingDouble().reversed()" to sort employees by salary in descending order.

7. Use "forEach()" to print the sorted results.

---

Concepts Used :

- Java 8 Streams
- "sorted()" method
- "Comparator"
- Lambda expressions

---

Files :

"Employee.java" → Employee model class

"StreamSortingExample.java" → Main program using streams
