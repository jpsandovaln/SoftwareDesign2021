package observer;

public class Company implements IClient{
    private String name;
    private int cellPhone;

    public Company(String name, int cellPhone) {
        this.name = name;
        this.cellPhone = cellPhone;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(String.format("Sending message to company: %s", this.name));
        System.out.println("whatsapp: " + this.cellPhone);
        System.out.println("message: " + message);
        System.out.println("+++++++++++++++++++++++++++++");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }
}
