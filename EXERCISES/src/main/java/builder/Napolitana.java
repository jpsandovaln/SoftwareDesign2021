package builder;

public class Napolitana implements IBuilderPizza {
    private Pizza pizza;

    public Napolitana() {
        this.pizza = new Pizza("soft", "spicy", "cheddar", "green", 1, 1);
    }

    public Napolitana withBasil(int basil) {
        this.pizza.setBasil(basil);
        return this;
    }

    public Napolitana withTomato(int tomato) {
        this.pizza.setTomato(tomato);
        return this;
    }

    @Override
    public Pizza build() {
        return this.pizza;
    }
}
