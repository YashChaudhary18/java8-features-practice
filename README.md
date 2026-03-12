# java8-features-practice

This repository contains practice programs demonstrating Java 8 Stream API features such as filtering, sorting, mapping, grouping, and handling null values using Optional.

The programs help understand how to process collections in a functional programming style using streams and lambda expressions.

---

Topics Covered :

1. Java 8 – Streams Basics

Create a Student list and perform:

- Print all students
- Filter students with marks greater than 70
- Find student with highest marks
- Count total students

---

2. Java 8 – Stream Sorting

Sort employee list using streams:

- Sort by salary ascending
- Sort by salary descending

---

3. Java 8 – Map Operation

Convert:

List<String> → List<Integer>

Example:

["Java","Spring","Boot"]
→ [4,6,4]

---

4. Java 8 – Grouping

Group students by marks using:

"Collectors.groupingBy()"

Example:

Marks 80 → list of students
Marks 90 → list of students

---

5. Optional & Null Handling

Program demonstrating:

- Student object may be null
- Use "Optional" to avoid "NullPointerException"

---

Project Structure :

java8-features-practice
│
├── StreamsBasics
│
├── StreamSorting
│
├── MapOperation
│
├── Grouping
│
├── Optional
│
└── README.md

---

Technologies Used :

- Java 8
- Stream API
- Lambda Expressions
- Collectors
- Optional

---

Purpose of This Repository :

This repository is created to practice modern Java programming using Stream API and functional programming concepts.
