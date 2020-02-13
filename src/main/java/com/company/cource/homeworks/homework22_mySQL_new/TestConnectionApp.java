package homeworks.homework22_mySQL_new;

import homeworks.homework22_mySQL_new.controller.MySQLConnect;
import homeworks.homework22_mySQL_new.mapping.UserEntityDataMapper;
import homeworks.homework22_mySQL_new.model.UserEntity;

import java.sql.SQLException;
import java.util.UUID;

public class TestConnectionApp {
    public static void main(String[] args) throws SQLException {
        String sqlQuery = "CREATE TABLE users_new3 (user_id INT NOT NULL PRIMARY KEY, username VARCHAR(40), password VARCHAR(255), email VARCHAR(255));";
        UserEntity user = new UserEntity("'" + UUID.randomUUID() + "'", "'Mikhail K.'", "'password1'","'m.korzh@gmail.com'");
        new MySQLConnect().insertIntoTable(user);
        //UserEntityDataMapper.findByUserName("Tom Erichsen");
    }
}