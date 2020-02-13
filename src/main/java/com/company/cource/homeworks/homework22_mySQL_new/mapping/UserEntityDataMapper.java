package homeworks.homework22_mySQL_new.mapping;

import homeworks.homework22_mySQL_new.controller.MySQLConnect;
import homeworks.homework22_mySQL_new.model.UserEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserEntityDataMapper implements UsersDataMapper {

    private static List<UserEntity> usersList = new ArrayList<>();
    private static List<UserEntity> temporaryUsersList = new ArrayList<>();

    UserEntity userEntity;


    public UserEntityDataMapper() throws SQLException {
        new MySQLConnect().showTable();
        ResultSet resultSet = MySQLConnect.getResultSet();
        while (resultSet.next()) {
            String user_id = resultSet.getString("user_id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String email = resultSet.getString("email");
            userEntity = new UserEntity(user_id, username, password, email);
            usersList.add(userEntity);
        }
    }


    public static void findByUserName(String userName) {
        for (UserEntity userEntity : usersList) {
            if (userEntity.getInitials().equals(usersList)) {
                System.out.println(userEntity);
                ;
            }
        }
    }


    @Override
    public List<UserEntity> findByUsername(String userName) {
        for (UserEntity userEntity : usersList) {
            if (userEntity.getInitials().equals(usersList)) ;
            temporaryUsersList.add(userEntity);
        }
        return temporaryUsersList;
    }

    @Override
    public List<UserEntity> findByEmail(String userEmail) {
        for (UserEntity userEntity : usersList) {
            if (userEntity.getId().equals(usersList)) ;
            temporaryUsersList.add(userEntity);
        }
        return temporaryUsersList;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return usersList;
    }


}
