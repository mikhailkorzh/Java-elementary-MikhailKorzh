package homeworks.homework25_JacksonMapper;

import com.squareup.okhttp.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Arrays;

public class UserRestClient {
    private ObjectMapper objectMapper;
    private OkHttpClient client;
    private static final String URL = "https://mk-data-storage.herokuapp.com/users/";

    public UserRestClient() {
        client = new OkHttpClient();
        objectMapper = new ObjectMapper();
    }

    public String create(UserEntity user) {
        RequestBody body = null;
        try {
            body = RequestBody
                    .create(MediaType.parse("application/json"),
                            objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
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

    public void update(UserEntity user) {
        RequestBody body = null;
        try {
            body = RequestBody
                    .create(MediaType.parse("application/json"),
                            objectMapper.writeValueAsString(user));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Request request = new Request.Builder()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .put(body)
                .url(URL + user.getId())
                .build();

        try {
            client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException("Error updating user " + e);
        }
    }

    public String getUser(String id) {
        Request request = new Request.Builder()
                .url(URL + id)
                .build();

        try {
            Response response = client.newCall(request).execute();
            UserEntity getUserResponse = objectMapper.readValue(response.body().string(), UserEntity.class);
            String indented = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(getUserResponse);
            return indented;
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

    public String getAllUsers() {
        Request request = new Request.Builder()
                .url(URL)
                .build();
        try {
            Response response = client.newCall(request).execute();
            UserEntity usersArray[] = objectMapper.readValue(response.body().string(), UserEntity[].class);
            String indented = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(Arrays.asList(usersArray));
            return indented;

        } catch (IOException e) {
            throw new RuntimeException("Error obtaining user " + e);
        }

    }
}
