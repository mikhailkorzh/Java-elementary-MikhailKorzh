package lectures.lecture22_mySqlDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class MySQLConnect {
    public static Connection connection;
    private static Statement statement;
    public static MySQLConnect db;
    private static UserEntity userEntity;

    private static List<UserEntity> usersList = new ArrayList<>();

    public MySQLConnect() {
        String DB_URL = "jdbc:mysql://localhost:3306/mytestdb";
        String driver = "com.mysql.cj.jdbc.Driver";
        String USER = "root";
        String PASS = "root";
        String query = "";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            //PreparedStatement ps = connection.prepareStatement("IF EXISTS CREATE DATABASE mytestdb");
            //int result = ps.executeUpdate();
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static MySQLConnect getDbCon() throws SQLException {
        if ( db == null ) {
            db = new MySQLConnect();
        }
        else if (db.getConnection().isClosed()){
            db = new MySQLConnect();
        };
        return db;

    }

    public ResultSet query(String query) throws SQLException{
        statement = connection.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    public int insert(String query) throws SQLException {
        statement = connection.createStatement();
        int result = statement.executeUpdate(query);
        return result;

    }

    public void clearTable() throws SQLException{//удаляем все из таблицы
        statement = connection.createStatement();
        statement.execute("DELETE FROM users");
    }

    public void closeConnection() throws SQLException{//закрываем соединение
        connection.close();
    }

    public static List showTable() throws SQLException{//вывод таблицы на экран

        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
        while(resultSet.next()){
            String user_id = resultSet.getString("user_id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String email = resultSet.getString("email");
            userEntity = new UserEntity(user_id, username, password, email);
            usersList.add(userEntity);
        }
        return usersList;
    }

}