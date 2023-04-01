package org.example.arraywork;

public class Employee implements Comparable<Employee> {
   private int id;
   private String name;
   private int age;
   private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overridden to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }


    @Override
    public int compareTo(Employee employee) {
        // To print the employees in ascending order
        // we need to send a negative, Zero or positive integer to see
        // whether this employee id is less than, equal to or greater than
        // the specified  employee object,  id as we are sorting by employee id.
        return (this.id - employee.id);
    }

}
