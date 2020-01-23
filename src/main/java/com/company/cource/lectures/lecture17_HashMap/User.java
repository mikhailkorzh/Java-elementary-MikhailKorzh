package lectures.lecture17_HashMap;

import java.util.List;

public class User {
    private String id;
    private List<Role> roles;
    private RegisteredData data;
    private PrivateDate privateDate;

    public User(String id, List<Role> roles, RegisteredData data, PrivateDate privateDate) {
        this.id = id;
        this.roles = roles;
        this.data = data;
        this.privateDate = privateDate;
    }


    public String getId() {
        return id;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public RegisteredData getData() {
        return data;
    }

    public PrivateDate getPrivateDate() {
        return privateDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", roles=" + roles +
                ", data=" + data +
                ", privateDate=" + privateDate +
                '}';
    }
}
