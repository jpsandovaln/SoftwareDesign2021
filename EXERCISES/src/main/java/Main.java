import generics.GenericObject;
import generics.IGeneric;
import generics.Validation;
import wildcards.Employee;
import wildcards.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Software Design - Exercises");
        /*List list = new ArrayList<>();
        list.add("a");
        list.add("b");

        String val = (String)list.get(0);

        GenericObject<String> genericObject = new GenericObject<>("5");
        System.out.println(genericObject.getVal());

        IGeneric<String> test = new Validation<>();
        boolean re = test.validate("hi");
        System.out.println(re);*/

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Juan", "Perez"));
        personList.add(new Person("Pepe", "Lopez"));
        displayData(personList);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ana", "Soto", 5000));
        employees.add(new Employee("Arturo", "Ledezma", 7000));
        displayData(employees);
    }

    private static void displayData(List<? extends Person> personList) {
        for(Person person : personList) {
            System.out.println(person.getLastName());
        }
    }
}
