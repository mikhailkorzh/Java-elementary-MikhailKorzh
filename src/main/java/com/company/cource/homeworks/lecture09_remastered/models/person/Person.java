package homeworks.lecture09_remastered.models.person;

public abstract class Person {
    int ID;
    String lastName;
    String firstName;

    public Person(int ID, String lastName, String firstName) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return "Person{" +
                "ID: " + ID +
                ", lastName: " + lastName + '\'' +
                ", firstName: " + firstName + '\'' +
                '}';
    }
}
