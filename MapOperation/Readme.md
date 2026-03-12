Java 8 Stream Map Operation Example

Overview :

This program demonstrates the map() operation in Java 8 Streams.

The program converts a list of strings into a list of integers representing the length of each string.

Example:

["Java","Spring","Boot"]
→ [4,6,4]

---

Steps :

1. Create a "List<String>" containing names.
2. Convert the list into a stream using "stream()".
3. Use the "map()" method to transform each string into its length.
4. Collect the result into a "List<Integer>" using "Collectors.toList()".
5. Print both the original list and the transformed list.

---

Concepts Used :

- Java 8 Streams
- "map()" transformation
- Lambda expressions
- "Collectors.toList()"

---

File :

"MapOperationExample.java" → Demonstrates converting names into their lengths using streams
