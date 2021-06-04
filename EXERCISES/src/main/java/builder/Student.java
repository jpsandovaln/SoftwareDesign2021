package builder;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int ci;
    private List<String> curses;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int ci) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ci = ci;
    }

    public Student(String firstName, String lastName, int ci, List<String> curses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ci = ci;
        this.curses = curses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public List<String> getCurses() {
        return curses;
    }

    public void setCurses(List<String> curses) {
        this.curses = curses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ci=" + ci +
                ", curses=" + curses +
                '}';
    }
}
