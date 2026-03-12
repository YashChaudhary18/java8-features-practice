Java 8 Optional & Null Handling

Overview :

This program demonstrates how to safely handle null values using the Optional class in Java 8.

Optional helps avoid NullPointerException when an object may be null.

---

Steps :

1. Create a Student class with attributes id, name, and marks.
2. Create a Student object that may be null.
3. Wrap the object using "Optional.ofNullable()".
4. Check if the value exists using "isPresent()".
5. If the object exists, display student information.
6. If the object is null, print a message.

---

Concepts Used :

- Java 8 Optional
- Null Handling
- "Optional.ofNullable()"
- "isPresent()"
- "ifPresent()"
