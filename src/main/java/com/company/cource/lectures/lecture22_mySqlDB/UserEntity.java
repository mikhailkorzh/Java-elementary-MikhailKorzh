package lectures.lecture22_mySqlDB;

public class UserEntity {

    private String id;
    private String initials;
    private String password;
    private String email;

    public UserEntity(String id, String initials, String password, String email) {
        this.id = id;
        this.initials = initials;
        this.password = password;
        this.email = email;
    }

    public String getId() {
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
        return "{" +
                "\"id\":\"" + id + '\'' +
                ", username\":\"" + initials + '\'' +
                ", password\":\"" + password + '\'' +
                ", email\":\"" + email + '\'' +
                '}';
    }
}
