package homeImprovization;

public class UserGetterBean {
    public int id;
    private String firstName;

    public UserGetterBean(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

}
