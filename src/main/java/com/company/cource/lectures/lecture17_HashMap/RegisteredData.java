package lectures.lecture17_HashMap;

public class RegisteredData {

    private String email;
    private String password;

    public RegisteredData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "RegisteredData{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
