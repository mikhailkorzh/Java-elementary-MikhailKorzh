package lectures.lecture22_mySqlDB;

public class UserEntity {

    private int id;
    private String initials;
    private String password;
    private String email;

    public UserEntity(int id, String initials, String password, String email) {
        this.id = id;
        this.initials = initials;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getInitials() {
        return initials;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", initials='" + initials + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
