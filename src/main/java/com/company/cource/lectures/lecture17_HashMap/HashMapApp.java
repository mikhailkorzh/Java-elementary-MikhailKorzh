package lectures.lecture17_HashMap;

import java.io.FileWriter;
import java.time.Instant;
import java.util.*;

public class HashMapApp {

    public static void main(String[] args) {
        /*Map<String, Integer> map = new HashMap<>();
        map.put("key0", 448);
        map.put("key1", 449);
        map.put("key2", 486);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());*/

        //map.entrySet().forEach(k -> System.out.println(k.hashCode()));
        /*User user1 = getUser();

        Map<String, String> userFlatMap = toFlatMap(user1);
        System.out.println(userFlatMap);*/

        saveToStorage(toFlatMap(getUser()));


    }

    public static User getUser() {
        RegisteredData regData = new RegisteredData("mikhai.korzh@gmail.com", "qwerty");
        PrivateDate personalData = new PrivateDate("Mikhail", "Korzh");
        List<Role> userRoles = Arrays.asList(Role.REGISTERED, Role.ADMIN);

        return new User(UUID.randomUUID().toString(), userRoles, regData, personalData);
    }

    public static HashMap<String, String> toFlatMap(User user) {
        Map<String, String> userFlatMap = new HashMap<>();
        userFlatMap.put("id", user.getId());
        userFlatMap.put("email", user.getData().getEmail());
        userFlatMap.put("name", user.getPrivateDate().getFirstName() + " " + user.getPrivateDate().getLastName().charAt(0));
        userFlatMap.put("roles", user.getRoles().toString());
        userFlatMap.put("created_date", Instant.now().toString());

        return (HashMap<String, String>) userFlatMap;
    }

    public static void saveToStorage(Map<String, String> user) {
        try {
            FileWriter writer = new FileWriter("users.csv", true);
            StringBuilder builder = new StringBuilder();
            user.entrySet().forEach(i -> builder.append(i).append(","));

            writer.write(builder.toString());
            writer.close();


        } catch (Exception ex) {
            throw new RuntimeException("Smth went wrong");
        }
    }

}
