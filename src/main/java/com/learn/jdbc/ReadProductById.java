package com.learn.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadProductById {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        try(Connection connection = databaseConnection.getConnection()){

//            String findProductByIdSql = "select * from product where product_id=? and product_name=?";
            String findProductByIdSql = "select * from product where product_category=? and product_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(findProductByIdSql);
          //  preparedStatement.setString(1, "0d591d4c-ef8d-4f56-8898-6033e686e0bd");
          //  preparedStatement.setString(2, "Ball");

            preparedStatement.setString(1, "Book");
            preparedStatement.setString(2, "0d591d4c-ef8d-4f56-8898-60c0e686e0bd2");

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(preparedStatement);

            while (resultSet.next()){
                System.out.println("++++++++++++++++++++++++++++++++++++++++++");

                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getInt(3));
                System.out.println(resultSet.getString(4));

                System.out.println("++++++++++++++++++++++++++++++++++++++++++");

            }

        }catch (Exception ex){

            System.out.println(ex.getMessage());
        }

    }
}
