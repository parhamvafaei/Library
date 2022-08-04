package entity;

public class Employee extends Person {

    double salary;

    public Employee(int id, String name, Role role, double salary) {
        super(id, name, role);
        this.salary = salary;
    }


}
