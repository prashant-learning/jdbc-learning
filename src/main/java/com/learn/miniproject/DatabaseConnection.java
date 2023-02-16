package com.learn.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        // loading a driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // creating a connection from DriverManger
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/uhgsmedb?user=root&password=Prashant@123");

        return connection;
    }
}
