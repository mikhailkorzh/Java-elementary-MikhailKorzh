package homeworks.homework22_mySQL_new.controller;

import homeworks.homework22_mySQL_new.model.UserEntity;

import java.sql.*;

public class MySQLConnect {
    private Connection connection;
    private Statement statement;
    private static MySQLConnect db;
    private static ResultSet resultSet;

    public MySQLConnect() {
        String DB_URL = "jdbc:mysql://localhost:3306/mytestdb";
        String driver = "com.mysql.cj.jdbc.Driver";
        String USER = "root";
        String PASS = "root";
        String query = "";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            //PreparedStatement ps = connection.prepareStatement("IF EXISTS CREATE DATABASE mytestdb");
            //int result = ps.executeUpdate();
        } catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static MySQLConnect getDbCon() throws SQLException {
        if (db == null) {
            db = new MySQLConnect();
        } else if (db.getConnection().isClosed()) {
            db = new MySQLConnect();
        }
        return db;

    }

    public void insertIntoTable(UserEntity userEntity) throws SQLException {
        String sqlQuery = "INSERT INTO users VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sqlQuery);

        statement.setString(1, userEntity.getId());
        statement.setString(2, userEntity.getInitials());
        statement.setString(3, userEntity.getPassword());
        statement.setString(4, userEntity.getEmail());

        int result = statement.executeUpdate();

        if (result <= 0) {
            throw new SQLException("Update query failed");
        }
        closeConnection();
    }

    public void clearTable() throws SQLException {
        statement = connection.createStatement();
        statement.execute("DELETE FROM users");
    }

    private void closeConnection() throws SQLException {
        connection.close();
    }

    public ResultSet showTable() throws SQLException {//вывод таблицы на экран

        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM users");
        return resultSet;
    }

    public static ResultSet getResultSet() {
        return resultSet;
    }

}