package composite;

import java.util.ArrayList;
import java.util.List;

public class Sales {
    private int id;
    List<Product> productList = new ArrayList<>();

    public Sales(int id) {
        this.id = id;
    }

    public int getTotal() {
        int total = 0;
        for (Product product: this.productList) {
            total += product.getPrice();
        }
        return total;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void removeProduct(Product product) {
        this.productList.remove(product);
    }

    public void display() {
        System.out.println("-----------------------------");
        System.out.println("Sales id: " + this.getId());
        for(Product product: this.productList) {
            System.out.println("Product: " + product.getName() + " - Price: " + product.getPrice());
        }
        System.out.println("Total: " + this.getTotal());
        System.out.println("-----------------------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
