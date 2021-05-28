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
import java.util.stream.IntStream;
import java.util.stream.Stream;


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

        /*List<Person> personList = new ArrayList<>();
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
        System.out.println("--------------------------------");*/
        //////////////////////////////////////////////////////

        // Java 8
        /*System.out.println(" ------ List -----------");
        List<String> list8 = Collections.unmodifiableList(Arrays.asList("a", "b" , "c"));
        // list8.add("d");
        list8.stream().forEach(value -> System.out.println(value));

        System.out.println(" ------ SET -----------");
        Set<String> set8 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("a", "b", "c")));
        //set8.add("d");
        set8.stream().forEach(value -> System.out.println(value));

        System.out.println(" ------ MAP -----------");
        Map<String, Integer> map8 = new HashMap<>();
        map8.put("a", 1);
        map8.put("b", 2);
        map8.put("c", 3);
        map8 = Collections.unmodifiableMap(map8);

        //set8.add("d");
        set8.stream().forEach(value -> System.out.println(value));
        map8.forEach((k,v) -> System.out.println(k + " - " + v));

        // java
        List<String> list9 = List.of("a", "b", "c");
        //list9.add("d");
        list9.stream().forEach(value -> System.out.println(value));

        Set<String> set9 = Set.of("a", "b", "c");

        Map<String, Integer> map9 = Map.of("a", 1);

        //////////////////////////////////////////////////////////


        List<String> valueList = Arrays.asList("1", "22", "333", "4444", "55555", "777777", "11", "88888888");
        valueList.forEach(System.out::println);
        System.out.println("*****************************************");

        // select * from valueList where data = 333
        valueList.stream()
                .filter(value -> value.equals("333"))
                .forEach(value -> System.out.println(value));

        valueList.stream()
                .filter(value -> Integer.parseInt(value) > 10)
                .sorted()
                .forEach(System.out::println);

        System.out.println(" ------------------takewhile -------------");
        valueList.stream()
                .takeWhile(value -> value.length() < 4)
                .forEach(System.out::println);

        System.out.println(" ----------------dropwhile ------------- ");
        valueList.stream()
            .dropWhile(value -> value.length() < 4)
                .forEach(System.out::println);


        IntStream.iterate(0, i -> i + 1).takeWhile(i -> i < 10).forEach(System.out::println);

        System.out.println(" ----------null -----------------------");
        // Stream<Integer> stream1 = Stream.of(null);
        // System.out.println(stream1.count());

        Stream<Integer> stream2 = Stream.ofNullable(null);
        System.out.println(stream2.count());


        // var a;
        // var lambdaTest = () -> {};
        // var value = null;
        // var arrays = { 1, 2};*/

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
