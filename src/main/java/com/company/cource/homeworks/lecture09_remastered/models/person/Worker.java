package homeworks.lecture09_remastered.models.person;

public class Worker extends Person {
    String position;

    public Worker(int ID, String lastName, String firstName, String position) {
        super(ID, lastName, firstName);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "ID: " + ID +
                ", position: " + position +
                ", lastName: " + lastName +
                ", firstName: " + firstName +
                '}';
    }
}
