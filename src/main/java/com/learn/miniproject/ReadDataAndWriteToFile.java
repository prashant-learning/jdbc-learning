package com.learn.miniproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 *    product_id -> string
 *    product_name -> String
 *    product_price -> int
 *    product_category -> String
 *
 *    UUID ->
 *    int ->
 *
 *    Generic
 *
 *
 *
 *    Home work  -> Calculate the product price by category
 *  *        Map<product_category, product_price>
 *  *        Map<String, Integer>
 *
 *
 *    Java 8  Functional programming
 *
 *    Docker
 *    Kubernetes
 *    kafka
 *    Rabbit MQ
 *    Database
 *    Cache
 *
 *    Micro services
 *    Spring
 *    Springboot
 *       1. Rest controller
 *       2. API design
 *       3. Cloud
 *       4. Services
 *       5. Respository
 *       6. Kafka
 *       7. MQ
 *       8. Config server
 *       9. Database connection pooling
 *
 *    Reactive java
 *       spring web flux
 *
 *       Reactor core
 *
 *
 *
 */
public class ReadDataAndWriteToFile {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection connection = databaseConnection.getConnection();

        Statement statement = connection.createStatement();

        String sqlQuery = "Select * from product";

        ResultSet resultSet = statement.executeQuery(sqlQuery);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("product_id,product_name,product_price,product_category\n");
        int sum = 0;

//        while (resultSet.next()){
//            stringBuilder.append(resultSet.getString(1));
//            stringBuilder.append(",");
//            stringBuilder.append(resultSet.getString(2));
//            stringBuilder.append(",");
//            stringBuilder.append(resultSet.getInt(3));
//            stringBuilder.append(",");
//            stringBuilder.append(resultSet.getString(4));
//            stringBuilder.append("\n");
//            sum = sum + resultSet.getInt(3);
//        }

        stringBuilder.append(",totalSum," +sum+",");

        Path path = Paths.get("product.csv");

        byte[] byteStream = stringBuilder.toString().getBytes();

        Files.write(path, byteStream);

        Map<String, Integer> map = calculateProductWisePrice(resultSet);

        System.out.println(map.get("Playing tool"));

    }

    public static Map<String, Integer> calculateProductWisePrice(ResultSet resultSet) throws SQLException {

        Map<String,Integer> priceMapping = new HashMap<>();

        while (resultSet.next()){

            String category = resultSet.getString(4);
            int price = resultSet.getInt(3);

            if(priceMapping.containsKey(category)){
                priceMapping.put(category, price + priceMapping.get(category));
            } else {
                priceMapping.put(category, price);
            }
        }
        return priceMapping;
    }
}
