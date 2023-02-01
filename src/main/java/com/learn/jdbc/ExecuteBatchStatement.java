package com.learn.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteBatchStatement {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();

            connection = databaseConnection.getConnection();

            statement =connection.createStatement();

            connection.setAutoCommit(false);

            String sql1 = "insert into product (product_id, product_name, product_price, product_category ) values ('0d591d4c-ef8d-4f56-8898-6033e686e5fg', 'Ball', 50, 'Playing tool')";

            statement.addBatch(sql1);

            String  sql2 = "insert into product (product_id, product_name, product_price, product_category ) values ('0d893d4c-ef8d-4f56-8898-6033e686e5fg', 'Toy', 678, 'Playing tool')";

            statement.addBatch(sql2);

            String  sql3 = "insert into product (product_id, product_name, product_price, product_category ) values ('0d893d4c-ef8d-4f56-4498-6033e686e5fg', 'Mirror', 40, 'Makeup tool')";

            statement.addBatch(sql3);

            int[] count = statement.executeBatch();

            connection.commit();
        } catch (Exception ex){
            System.out.println(ex.getStackTrace());
        } finally {
            try {
                assert statement != null;
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
