package StreamsBasics;


// Student class

public class Student {

    int id;
    String name;
    int marks;

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
    }
}