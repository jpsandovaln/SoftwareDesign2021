package prototype;

public class Bus implements Cloneable {
    private int id;
    private String color;
    private int year;
    private BusDriver busDriver;

    public Bus(int id, String color, int year, BusDriver busDriver) {
        this.id = id;
        this.color = color;
        this.year = year;
        this.busDriver = busDriver;
    }

    public Bus clone() throws CloneNotSupportedException {
        return (Bus) super.clone();
    }

    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) {
        this.busDriver = busDriver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", busDriver=" + busDriver +
                '}';
    }
}
