package homeworks.homework22_mySQL;

import java.sql.*;

public class MySQLConnect {
    public Connection connection;
    private Statement statement;
    public static MySQLConnect db;

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
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    public int insert(String query) throws SQLException {
        statement = connection.createStatement();
        int result = statement.executeUpdate(query);
        return result;

    }

}
