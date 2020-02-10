package lectures.lecture22_mySqlDB;

import java.sql.SQLException;
import java.util.UUID;

class TestConnectionApp {
    public static void main(String[] args) throws SQLException {
        String sqlQuery = "CREATE TABLE users_new (user_id VARCHAR(255) PRIMARY KEY, username VARCHAR(40), password VARCHAR(255), email VARCHAR(255));";
        //System.out.println(mySQLConnect.query(sqlQuery));
        String insertUser = "INSERT INTO users VALUES (1235, 'Tom Erichsen', 'password1', 'Tom.Erichsen@gmail.com');";
        String insertUser1 = "INSERT INTO users VALUES (1235, 'Tom Erichsen', 'password2', 'Tommy.Li@gmail.com');";

        //new MySQLConnect().insert(insertUser1);
        System.out.println(new MySQLConnect().showTable());

    }
}