package homeworks.lecture24_Networking;
import com.squareup.okhttp.*;
import lectures.lecture17_HashMap.User;
import lectures.lecture22_mySqlDB.UserEntity;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserRestClient {
    private OkHttpClient client;
    private static final String URL = "https://mk-data-storage.herokuapp.com/users/";
    private Object HashMap;

    public UserRestClient() {
        client = new OkHttpClient();
    }

    public String create(UserEntity user) {
        RequestBody body = RequestBody
                .create(MediaType.parse("application/json"),
                        user.toString());

        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .header("content-type", "application/json")
                .post(body)
                .url(URL)
                .build();

        try {
            Response response = client.newCall(request).execute();
            return new JSONObject(response.body().string()).getString("id");
        } catch (IOException e) {
            throw new RuntimeException("Error creating user " + e);
        }
    }

    public void update(User user) {
        RequestBody body = RequestBody
                .create(MediaType.parse("application/json"),
                        user.toString());

        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .header("content-type", "application/json")
                .put(body)
                .url(URL + user.getId())
                .build();

        try {
            client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException("Error updating user " + e);
        }
    }

    public UserEntity getUser(String id) {
        Request request = new Request.Builder()
                .url(URL + id)
                .build();

        try {
            Response response = client.newCall(request).execute();
            return mapper(new JSONObject(response.body().toString()));
        } catch (IOException e) {
            throw new RuntimeException("Error obtaining user " + e);
        }
    }

    public void delete(String id) {
        Request request = new Request.Builder()
                .delete()
                .url(URL + id)
                .build();
        try {
            client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException("Error deleting user " + e);
        }
    }

    public List<UserEntity> getAllUsers() {
        Request request = new Request.Builder()
                .url(URL)
                .build();
        try {
            List<UserEntity> users = new ArrayList<>();
            Response response = client.newCall(request).execute();
            JSONArray object = new JSONArray(response.body().string());
            for (Object userObject : object.toList()) {
                users.add(mapper(new JSONObject((HashMap) userObject)));
            }
            return users;

        } catch (IOException e) {
            throw new RuntimeException("Error obtaining user " + e);
        }

    }

    private UserEntity mapper(JSONObject jsonObject) {
        return new UserEntity(
                jsonObject.getString("user_id"),
                jsonObject.getString("username"),
                jsonObject.getString("password"),
                jsonObject.getString("email")
        );
    }


}
