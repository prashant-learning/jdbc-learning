package com.learn.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetProductCountByCategory {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection connection = databaseConnection.getConnection();

        Statement statement = connection.createStatement();

        String sqlQuery = "select product_category,  count(product_category), sum(product_price)  from uhgsmedb.product group by  product_category; ";

        ResultSet resultSet = statement.executeQuery(sqlQuery);

       while (resultSet.next()){
           System.out.println(  "Product categoury is " + resultSet.getString(1) +
                   "Product count is " + resultSet.getInt(2)
                   + " product sum is " + resultSet.getInt(3));
       }
        //System.out.println(resultSet.getFetchSize());
    }
}
