package com.learn.miniproject;

import java.sql.Connection;
import java.sql.SQLException;

public class ReadDataAndWriteToFile {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection connection = databaseConnection.getConnection();

    }
}
