package prototype;

public class Table implements IProduct {

    private String color;
    private String type;
    private Wood wood;

    public Table(String color, String type, Wood wood) {
        this.color = color;
        this.type = type;
        this.wood = wood;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    @Override
    public void build() {

    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return  null;
        }
    }

    @Override
    public Object deepClone() {
        try {
            Table table = (Table) super.clone();
            table.setWood(this.wood.clone());
            return table;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", wood=" + wood +
                '}';
    }
}
