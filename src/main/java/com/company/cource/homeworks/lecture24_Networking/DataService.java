package homeworks.lecture24_Networking;

import lectures.lecture22_mySqlDB.UserEntity;

public class DataService {
    public static void main(String[] args) {
        UserRestClient client = new UserRestClient();
        System.out.println(client.getAllUsers());
        UserEntity userEntity = new UserEntity("aec6c27c-cf3a-4d8b-b61f-a47e0286vv71", "Test", "Test", "Test");
        String id = client.create(userEntity);
        System.out.println(client.getUser(id));

    }
}
