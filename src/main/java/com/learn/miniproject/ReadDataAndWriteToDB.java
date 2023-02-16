package com.learn.miniproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ReadDataAndWriteToDB {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        List<String> inputData = Files.readAllLines(Paths.get("src/main/resources/data.csv"));

        inputData.remove(0); // removing header

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection connection = databaseConnection.getConnection();

        String query = "insert into product (product_id, product_name, product_price,product_category)  values (?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        connection.setAutoCommit(false);

        for (String entry: inputData) {

            String[] eachRecordDetails = entry.split(",");

            preparedStatement.setString(1, eachRecordDetails[0]);
            preparedStatement.setString(2, eachRecordDetails[1]);
            preparedStatement.setInt(3, Integer.parseInt(eachRecordDetails[2]));
            preparedStatement.setString(4, eachRecordDetails[3]);

            preparedStatement.addBatch();

        }
        preparedStatement.executeBatch();

        connection.commit();

        connection.close();
    }
}
