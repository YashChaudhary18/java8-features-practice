/* Employee class for StreamSortingExample. */
package StreamSorting;

// Employee class

public class Employee {

    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Salary: " + salary);
    }
}
