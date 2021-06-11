package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends Product {
    private List<Product> productList;

    public CompositeProduct(String name) {
        super(name, 0);
        this.productList = new ArrayList<>();
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (Product product : productList) {
            price += product.getPrice();
        }
        return price;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void removeProduct(Product product) {
        this.productList.remove(product);
    }

    /*@Override
    public void setPrice(int price) throws Exception{
        throw new Exception("invalid option");
    }*/
}
