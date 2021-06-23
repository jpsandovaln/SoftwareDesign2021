import adapter.HdmiCable;
import adapter.HdmiToRcaAdapter;
import adapter.ICable;
import adapter.RcaCable;
import builder.*;
import chain.*;
import command.*;
import composite.CompositeProduct;
import composite.Hardware;
import composite.Sales;
import composite.Software;
import covarience.Car;
import covarience.Land;
import covarience.Transport;
import decorator.*;
import generics.GenericObject;
import generics.IGeneric;
import generics.Validation;
import memento.Caretaker;
import memento.Computer;
import observer.*;
import practice_two.MyCustomList;
import prototype.Bus;
import prototype.BusDriver;
import prototype.Table;
import prototype.Wood;
import proxy.IOperation;
import proxy.Operation;
import proxy.OperationProxy;
import state.*;
import strategy.Employee;
import strategy.Exercises;
import visitor.*;
import wildcards.Person;

import javax.swing.*;
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

        Exercises exercises = new Exercises();
        // exercises.operations("list");
        // exercises.operations("max");
        //exercises.operations("fact");

        //exercises.operations2("list");

        /*Employee employee = new Employee("Juan", "Perez", 10);
        System.out.println(employee.isValid());*/

        /* Student student1 = new Student("Pepe", "Suarez");
        Student student2 = new Student("Maria", "Arce", 54222);

        List<String> courses = new ArrayList<>();
        courses.add("math");
        courses.add("lang");
        courses.add("his");

        Student student3 = new Student("Ana", "Lopez", 55, courses);
        testStudent(student1);

        Student student4 = new StudentBuilder("Pepe", "Suarez").build();
        Student student5 = new StudentBuilder("Maria", "Arce").withCi(544).build();
        Student student6 = new StudentBuilder("Ana", "Lopez").withCi(55).withCourse("math").withCourse("lang").build();


        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);


        Pizza hawaiana = new Pizza("soft", "sweet", "mozzarella", 1, 1);
        Pizza napolitana = new Pizza("soft", "spicy", "cheddar", "green", 1, 1);
        Pizza bolognesa = new Pizza("soft", "sweet", "mozzarella", 2, "yes");


        Pizza hawaiana2 = new Hawaiana().withHam(1).withPineapple(1).build();
        Pizza napolitana2 = new Napolitana().build();
        Pizza napolitana3 = new Napolitana().withBasil(2).build();
        Pizza bolognesa2 = new Bolognesa().withSauce("spicy").withMeat("yes").build(); */

        /*HdmiCable hdmiCable = new HdmiCable();
        hdmiCable.transmitDataMultimedia();

        RcaCable rcaCable = new RcaCable();
        /*rcaCable.video();
        rcaCable.audioR();
        rcaCable.audioL();*/
        /*rcaCable.transmitDataMultimedia();

        ICable cable = new HdmiCable();
        cable.transmitDataMultimedia();*/

        /*try {
            Bus bus1 = new Bus(1, "red", 2000, new BusDriver("JUAN", "PEREZ"));
            Bus bus2 = bus1.clone();

            System.out.println(bus1);
            System.out.println(bus2);

            bus1.setId(2);
            bus1.getBusDriver().setFirstName("PEPE");

            System.out.println(bus1);
            System.out.println(bus2);

            System.out.println("*-*-*-*--*-*--*-*----*");

            Table table1 = new Table("black", "A", new Wood(1, 50));
            Table table2 = (Table) table1.clone();

            System.out.println(table1);
            System.out.println(table2);

            table2.setColor("blue");
            table2.getWood().setPrice(100);

            System.out.println(table1);
            System.out.println(table2);

            System.out.println("*************************");

            Table table3 = new Table("black", "A", new Wood(1, 50));
            Table table4 = (Table) table3.deepClone();

            System.out.println(table3);
            System.out.println(table4);

            table4.setColor("blue");
            table4.getWood().setPrice(100);

            System.out.println(table3);
            System.out.println(table4);


        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }*/

        /*Hardware memory = new Hardware("memory", 100, "abc");
        Hardware Hdd = new Hardware("Hdd", 200, "xyz");
        Hardware motherboard = new Hardware("motherboard", 300, "asus");

        Software cd = new Software("Windows", 30, "os");

        CompositeProduct comProduct1 = new CompositeProduct("Pc Gamer");
        comProduct1.addProduct(memory);
        comProduct1.addProduct(Hdd);


        CompositeProduct comProduct2 = new CompositeProduct("PC1");
        comProduct2.addProduct(memory);
        comProduct2.addProduct(Hdd);
        comProduct2.addProduct(cd);


        CompositeProduct comProduct3 = new CompositeProduct("PC2");
        comProduct3.addProduct(Hdd);
        comProduct3.addProduct(cd);

        CompositeProduct combo = new CompositeProduct("Combo pc");
        combo.addProduct(comProduct1);
        combo.addProduct(comProduct2);


        Sales sales1 = new Sales(1);
        sales1.addProduct(memory);
        sales1.display();


        Sales sales2 = new Sales(2);
        sales2.addProduct(memory);
        sales2.addProduct(Hdd);
        sales2.addProduct(motherboard);
        sales2.display();

        Sales sales3 = new Sales(3);
        sales3.addProduct(comProduct3);
        sales3.addProduct(memory);
        sales3.display();

        Sales sales4 = new Sales(4);
        sales4.addProduct(combo);
        sales4.addProduct(comProduct3);
        sales4.addProduct(Hdd);
        sales4.display();*/

        /*Player player = new Player("track1", "D:/video.mp4");
        player.execute();

        player.setState(Player.PLAY_STATE);
        player.execute();

        player.setState(Player.STOP_STATE);
        player.execute();

        player.setState(Player.PAUSE_STATE);
        player.execute();

        player.setState(Player.NEXT_STATE);
        player.execute();

        player.setState(Player.PREVIOUS_STATE);
        player.execute();
        System.out.println("***************************");
        PlayStatePattern playStatePattern = new PlayStatePattern("track2", "d:/video2.mp4");
        playStatePattern.execute();

        playStatePattern.setState(new PlayState());
        playStatePattern.execute();

        playStatePattern.setState(new StopState());
        playStatePattern.execute();

        playStatePattern.setState(new PauseState());
        playStatePattern.execute();

        playStatePattern.setState(new NextState());
        playStatePattern.execute();

        playStatePattern.setState(new PreviousState());
        playStatePattern.execute();*/

        /*try {
            Asset video = new VideoToImage("test.mp4", "png");
            video.convert();

            Asset word = new WordToPdf("result.pdf", "office");
            word.convert();

            System.out.println("*************************");

            IVisitor visitorLog = new AssetLogVisitor();
            video.accept(visitorLog);
            word.accept(visitorLog);

            System.out.println("**-*-*-*-*----*--");
            VideoToImage video2 = new VideoToImage("test2.mp4", "jpg");
            System.out.println( video2.getVideoName());
            IVisitor encrypt = new EncryptVisitor();
            video2.accept(encrypt);
            System.out.println(video2.getVideoName());




        }catch (Exception ex) {
            ex.getMessage();
        }*/

        /*JFrame frame = new JFrame("Test");

        ButtonComponent accept = new PrimaryButton("Accept");
        accept.setStyle();

        ButtonComponent cancel = new SecondButton("Cancel");
        cancel.setStyle();

        System.out.println(" ****************************************");
        accept = new GreenStyle(accept);
        accept.setStyle();

        ButtonComponent accept2 = new GreenStyle(new PrimaryButton("Accept 2"));
        accept2.setStyle();

        System.out.println("*-*-*-*-*-*---*---*");

        ButtonComponent accept3 = new BorderStyle(new GreenStyle(new PrimaryButton("Accept3")));
        accept3.setStyle();

        ButtonComponent cancel2 = new BorderStyle(new SecondButton("Cancel 2"));
        cancel2.setStyle();


        frame.add(accept3.getButton());
        frame.add(cancel2.getButton());

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);*/

        /*try {
            IOperation operation = new Operation(5);
            operation.process();

            System.out.println(" **********************************");

            IOperation operation2 = new OperationProxy(5);
            operation2.process();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }*/

        /*Logger logInfo = new InfoLogger();
        Logger logNotice = new NoticeLogger();
        Logger logError = new ErrorLogger();

        logInfo.setNextLogger(logNotice);
        logNotice.setNextLogger(logError);

        Logger logger = logInfo;

        logger.message("enter method", Logger.INFO);
        System.out.println(" ************************** ");
        logger.message("enter method", Logger.NOTICE);
        System.out.println(" ************************** ");
        logger.message("enter method", Logger.ERROR);*/

        /*ATM atm100 = new ATM100();
        ATM atm50 = new ATM50();
        ATM atm10 = new ATM10();

        atm100.setNextChain(atm50);
        atm50.setNextChain(atm10);


        System.out.println("************************");
        atm100.dispense(210);
        System.out.println("************************");
        atm100.dispense(180);
        System.out.println("************************");
        atm100.dispense(370);*/

        /* IObservableProductNotification ob1 = new ProductNotification();

        ob1.addObserverClient("pc", new Consumer("Maria", "Arce", "maria@gmail.com"));
        ob1.addObserverClient("pc", new Consumer("Carlos", "Lima", "carlos@gmail.com"));

        ob1.addObserverClient("car", new Consumer("pepe", "Vargas", "pepe@gmail.com"));
        ob1.addObserverClient("car", new Consumer("Juan", "Perez", "juan@gmail.com"));
        ob1.addObserverClient("car", new Company("Toyota Bolivia", 123456));

        Scanner sc = new Scanner(System.in);
        System.out.println("Add product");
        String product = sc.next();

        ob1.notifyAllClients(product, "This product is available"); */

        //Command command = new StartCbbaServer(new CbbaServer());
        /*Command command = new EndCbbaServer(new CbbaServer());

        Invoker serverAdmin = new Invoker(command);
        serverAdmin.run();*/

        Computer computer = new Computer("unix", "16GB", "1TB");
        System.out.println(computer);

        Caretaker caretaker = new Caretaker();
        caretaker.addComputer(1, computer.backup());

        computer.setHdd("512GB");
        computer.setMemory("128MB");
        computer.setOp("Win");
        System.out.println(computer);

        caretaker.addComputer(2, computer.backup());

        computer.restore(caretaker.getComputer(1));
        System.out.println(computer);

        computer.restore(caretaker.getComputer(2));
        System.out.println(computer);
    }

    public static void testStudent(Student student) {
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
