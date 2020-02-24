package homeImprovization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import homeworks.homework22_mySQL_new.model.UserEntity;

public class GsonTransformerController {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static UserEntity userEntity = new UserEntity("123", "Mikhail", "qwerty", "mikhail.korzh@gmail.com");
    private static String json = GSON.toJson(userEntity);

    public static String toJson() {
        return json;
    }

    public static UserEntity fromJson() {
        userEntity = GSON.fromJson(json, UserEntity.class);
        return new UserEntity(userEntity.getId(), userEntity.getInitials(), userEntity.getEmail(), userEntity.getPassword());
    }
}
