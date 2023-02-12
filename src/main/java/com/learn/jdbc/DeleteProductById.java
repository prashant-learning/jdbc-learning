package com.learn.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteProductById {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // what be first step to connect the BD
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getConnection();

        String query = "delete from product where product_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, args[0]);

        preparedStatement.executeUpdate();
    }
}


/**
 *
 *   Insert into db using statement and PS
 *
 */
