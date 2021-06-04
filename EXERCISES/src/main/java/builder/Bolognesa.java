package builder;

public class Bolognesa implements IBuilderPizza{
    private Pizza pizza;

    public Bolognesa() {
        this.pizza = new Pizza("soft", "sweet", "mozzarella");
    }

    public Bolognesa withDough(String dough) {
        this.pizza.setDough(dough);
        return this;
    }

    public Bolognesa withSauce(String sauce) {
        this.pizza.setSauce(sauce);
        return this;
    }

    public Bolognesa withCheese(String cheese) {
        this.pizza.setCheese(cheese);
        return this;
    }

    public Bolognesa withMeat(String meat) {
        this.pizza.setMeat(meat);
        return this;
    }

    @Override
    public Pizza build() {
        return this.pizza;
    }
}
