import covarience.Car;
import covarience.Land;
import covarience.Transport;
import generics.GenericObject;
import generics.IGeneric;
import generics.Validation;
import practice_two.MyCustomList;
import wildcards.Employee;
import wildcards.Person;

import java.util.*;

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

        Transport transport1 = new Transport();
        Transport transport2 = new Land();
        Transport transport3 = new Car();

        Land land1 = new Land();
        Land land2 = new Land();

        Car car1 = new Car();

        //showData(transport1);
        showData(land1);
        showData(car1);

        List<Transport> transportList = new ArrayList<>();
        transportList.add(transport1);
        transportList.add(transport2);
        transportList.add(transport3);

        List<Land> landList = new ArrayList<>();
        landList.add(land1);
        landList.add(land2);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);

        showData(transportList);
        showData(landList);
        // showData(carList);

        // Practice: 2
        System.out.println("-------- PRACTICE 2 ------------");
        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.add(1);
        list2.add(2);
        list2.addFirst(2);
        list2.addLast(8);

        list2.print();
        System.out.println("--------------------------------");
    }


    private static void displayData(List<? extends Person> personList) {
        for(Person person : personList) {
            System.out.println(person.getLastName());
        }
    }

    private static void showData(Land land) {

    }
    private static void showData(List<? super Land> transportList) {

    }
}
