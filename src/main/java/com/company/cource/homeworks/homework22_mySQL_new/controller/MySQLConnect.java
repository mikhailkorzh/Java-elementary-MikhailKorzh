package homeworks.homework22_mySQL_new.controller;

import java.sql.*;

public class MySQLConnect {
    private Connection connection;
    private Statement statement;
    private static MySQLConnect db;
    private static ResultSet resultSet;

    MySQLConnect() {
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
        resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public int insert(String query) throws SQLException {
        statement = connection.createStatement();
        int result = statement.executeUpdate(query);
        return result;

    }

    public void clearTable() throws SQLException{
        statement = connection.createStatement();
        statement.execute("DELETE FROM users");
    }

    public void closeConnection() throws SQLException{//закрываем соединение
        connection.close();
    }

    public ResultSet showTable() throws SQLException{//вывод таблицы на экран

        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM users");
        return resultSet;
    }

    public static ResultSet getResultSet() {
        return resultSet;
    }

}