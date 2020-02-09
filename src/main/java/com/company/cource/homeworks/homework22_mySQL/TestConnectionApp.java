package homeworks.homework22_mySQL;

import java.sql.SQLException;

public class TestConnectionApp {
    public static void main(String[] args) throws SQLException {
       String sqlQuery = "CREATE TABLE users_new (user_id VARCHAR(40) PRIMARY KEY, username VARCHAR(40), password VARCHAR(255), email VARCHAR(255));";
        //System.out.println(mySQLConnect.query(sqlQuery));
        new MySQLConnect().insert(sqlQuery);
    }
}
