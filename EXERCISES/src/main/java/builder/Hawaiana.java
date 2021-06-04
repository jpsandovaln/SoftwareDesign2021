package builder;

public class Hawaiana implements IBuilderPizza{
    private Pizza pizza;

    public  Hawaiana() {
        this.pizza = new Pizza("soft", "sweet", "mozzarella");
    }

    public Hawaiana withHam(int ham) {
        this.pizza.setHam(ham);
        return this;
    }

    public Hawaiana withPineapple(int pineapple) {
        this.pizza.setPineapple(pineapple);
        return this;
    }

    @Override
    public Pizza build() {
        return this.pizza;
    }
}
