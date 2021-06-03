package strategy;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isValid() {
        /*if (this.firstName == null || this.firstName.isEmpty()) {
            return false;
        }
        if (this.lastName == null || this.lastName.isEmpty()) {
            return false;
        }
        if(this.age <= 0 || this.age >= 100) {
            return false;
        }*/
        List<IValidator> validatorList = new ArrayList<>();
        validatorList.add(new EmptyOrNotNull(this.firstName));
        validatorList.add(new EmptyOrNotNull(this.lastName));
        validatorList.add(new AgeValidator(this.age));

        ValidatorContext context = new ValidatorContext(validatorList);
        return context.isValid();
    }
}
