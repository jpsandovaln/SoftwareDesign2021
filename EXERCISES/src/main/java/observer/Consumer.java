package observer;

public class Consumer implements IClient{
    private String firstName;
    private String lastName;
    private String email;

    public Consumer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("----------------------------");
        System.out.println(String.format("Sending message to consumer: %s %s", this.firstName, this.lastName));
        System.out.println("email: " + this.email);
        System.out.println("message: " + message);
        System.out.println("----------------------------");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
