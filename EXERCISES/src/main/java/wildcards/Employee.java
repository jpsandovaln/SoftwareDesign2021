package wildcards;

public class Employee extends Person {
    private int salary;

    public Employee(String name, String lastName, int salary) {
        super(name, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
