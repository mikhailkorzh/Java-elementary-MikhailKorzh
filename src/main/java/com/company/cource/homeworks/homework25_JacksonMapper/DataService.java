package homeworks.homework25_JacksonMapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import homeworks.lecture24_Networking.UserRestClient;

public class DataService {
    public static void main(String[] args) {
        final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        UserRestClient client = new UserRestClient();
        System.out.println(client.getAllUsers());
        System.out.println(client.getUser("aec6c27c-cf3a-4d8b-b61f-a47e0286aa71"));
    }
}
