package com.learn.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 *    executeQuery  -> select query
 *    executeQuery ->   Insert, Update, delete
 *
 *    executeBatch  -> execute multiple  Insert, Update, delete
 *
 *
 *
 */

public class UpdateProductPriceByPS {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        DatabaseConnection databaseConnection = new DatabaseConnection(); // get an object of DC class

        Connection connection = databaseConnection.getConnection();

        String myQuery = "update product set product_price=? where product_id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(myQuery);

        preparedStatement.setInt(1, Integer.parseInt(args[0]));
        preparedStatement.setString(2, args[1]);

        preparedStatement.executeUpdate();

        // executeQuery -> get output from the query (SELECT query) and executeUpdate

        connection.close();

    }
}
