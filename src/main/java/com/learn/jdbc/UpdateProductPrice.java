package com.learn.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *    try {
 *
 *
 *    }catch(){
 *
 *    } finally{
 *
 *    }
 *
 *
 */
public class UpdateProductPrice {

    public static void main(String[] args)  {
        Statement statement = null;
        Connection connection = null;

        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();

            // get the connection from DB connection
             connection = databaseConnection.getConnection();

             String sqlUpdateQuery = "update product set product_price=5000 where product_id='3da7624d-3e9e-4143-9337-e2d4c6031e18'";

            // get the statement and execute your queries
             statement = connection.createStatement();

             statement.executeUpdate(sqlUpdateQuery);


        } catch (Exception exception){
            System.out.println(exception.getStackTrace());
        } finally {
            // connection and statement need to be closed
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
