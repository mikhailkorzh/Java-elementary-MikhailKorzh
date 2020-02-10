package homeworks.homework22_mySQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserEntityDataMapper {

    private static List<UserEntity> usersList = new ArrayList<>();
    UserEntity userEntity;


    public UserEntityDataMapper() throws SQLException {
        ResultSet resultSet = MySQLConnect.getResultSet();
        while(resultSet.next()){
            String user_id = resultSet.getString("user_id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String email = resultSet.getString("email");
            userEntity = new UserEntity(user_id, username, password, email);
            usersList.add(userEntity);
        }
    }

    public List<UserEntity> getAllUsers() {
        return usersList;
    }

    public void findByUserName(String userName) {
        for(UserEntity userEntity: usersList){
            if(userEntity.getInitials().equals(usersList)){
                System.out.println(userEntity);;
            }
        }
    }


}
