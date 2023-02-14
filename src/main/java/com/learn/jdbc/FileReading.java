package com.learn.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReading {

    public static void main(String[] args) throws IOException {

        // Using normal try catch
        FileInputStream fileInputStream = null;
        try {
            File file = new File("src/main/resources/input.csv");
            fileInputStream = new FileInputStream(file);

           // System.out.println(Arrays.toString(fileInputStream.readAllBytes()));
           String content =  new String(fileInputStream.readAllBytes(), StandardCharsets.UTF_8 );

            System.out.println(content);
        }catch (Exception ex){
            System.out.println("we are here ");
            System.out.println(ex.getMessage());
            fileInputStream.close();
            //System.out.println(fileInputStream.());
        }

        // using try with resources

        try(FileInputStream fis = new FileInputStream(new File("src/main/resources/input.csv"))) {
            String content =  new String(fis.readAllBytes(), StandardCharsets.UTF_8 );

            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Multiple way to read file
    }
}
