package homeworks.homework22_mySQL;

import homeworks.homework14_mapper.exceptions.GameNotFoundException;

import java.sql.SQLException;
import java.util.UUID;

public class TestConnectionApp {
    public static void main(String[] args) throws SQLException {
        String sqlQuery = "CREATE TABLE users_new3 (user_id INT NOT NULL PRIMARY KEY, username VARCHAR(40), password VARCHAR(255), email VARCHAR(255));";
        //System.out.println(mySQLConnect.query(sqlQuery));
        String insertUser = "INSERT INTO users VALUES ('" + UUID.randomUUID() + "', 'Tom Erichsen', 'password1', 'Tom.Erichsen@gmail.com');";
        //new MySQLConnect().insert(sqlQuery);
        //new MySQLConnect().insert(insertUser);
        //new MySQLConnect().clearTable();
        new MySQLConnect().showTable();
        //System.out.println(new UserEntityDataMapper().getAllUsers());
        new UserEntityDataMapper().findByUserName("Tom Erichsen");
    }
}