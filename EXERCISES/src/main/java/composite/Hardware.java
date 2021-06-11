package composite;

public class Hardware extends Product {
    private String brand;

    public Hardware(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
