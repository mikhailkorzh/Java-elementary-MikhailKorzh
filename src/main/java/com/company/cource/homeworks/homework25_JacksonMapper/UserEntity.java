package homeworks.homework25_JacksonMapper;

public class UserEntity {
    private String id;
    private String username;
    private String password;
    private String email;

    UserRestClient client;

    public UserEntity(UserRestClient client) {
        this.client = client;
    }

    public UserEntity(){

    }

    public UserEntity(String id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
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
                "\"id\":\"" + id + '\"' +
                ", \"username\":\"" + username + '\"' +
                ", \"password\":\"" + password + '\"' +
                ", \"email\":\"" + email + '\"' +
                '}';
    }
}
