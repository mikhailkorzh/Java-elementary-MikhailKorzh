package lectures.lecture24_Networking;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import homeworks.homework22_mySQL_new.model.UserEntity;
import org.json.JSONArray;
import org.json.JSONObject;
import okio.Okio;
import okio.Sink;
import okio.Source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class RemoteUserDataMapper {

    private static List<UserEntity> usersList = new ArrayList<>();


    public RemoteUserDataMapper(String url) {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .header("Accept", "application/json")
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            JSONArray array = new JSONArray(response.body().string());

            for (Object userObject: array.toList()){
                JSONObject jsonUserObject = (JSONObject) userObject;

                usersList.add(
                        new UserEntity(
                                jsonUserObject.getString("user_id"),
                                jsonUserObject.getString("username"),
                                jsonUserObject.getString("password"),
                                jsonUserObject.getString("email")
                        )
                );

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static List<UserEntity> getAllUsers() {
        return usersList;
    }

}
