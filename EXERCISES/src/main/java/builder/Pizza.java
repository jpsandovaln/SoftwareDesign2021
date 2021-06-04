package builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String cheese;

    private int Ham;
    private int pineapple;

    private String olive;
    private int basil;
    private int tomato;
    private int corn;
    private String meat;

    public Pizza(String dough, String sauce, String cheese) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    // Hawaiana
    public Pizza(String dough, String sauce, String cheese, int ham, int pineapple) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        Ham = ham;
        this.pineapple = pineapple;
    }

    // Napolitana
    public Pizza(String dough, String sauce, String cheese, String olive, int basil, int tomato) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.olive = olive;
        this.basil = basil;
        this.tomato = tomato;
    }

    // Bolognesa
    public Pizza(String dough, String sauce, String cheese, int corn, String meat) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.corn = corn;
        this.meat = meat;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public int getHam() {
        return Ham;
    }

    public void setHam(int ham) {
        Ham = ham;
    }

    public int getPineapple() {
        return pineapple;
    }

    public void setPineapple(int pineapple) {
        this.pineapple = pineapple;
    }

    public String getOlive() {
        return olive;
    }

    public void setOlive(String olive) {
        this.olive = olive;
    }

    public int getBasil() {
        return basil;
    }

    public void setBasil(int basil) {
        this.basil = basil;
    }

    public int getTomato() {
        return tomato;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public int getCorn() {
        return corn;
    }

    public void setCorn(int corn) {
        this.corn = corn;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", Ham=" + Ham +
                ", pineapple=" + pineapple +
                ", olive='" + olive + '\'' +
                ", basil=" + basil +
                ", tomato=" + tomato +
                ", corn=" + corn +
                ", meat='" + meat + '\'' +
                '}';
    }
}
