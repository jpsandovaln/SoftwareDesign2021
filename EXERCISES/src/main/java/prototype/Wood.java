package prototype;

public class Wood implements Cloneable {
    private int id;
    private int price;

    public Wood(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public Wood clone() throws CloneNotSupportedException {
        return (Wood) super.clone();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wood{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
