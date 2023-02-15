package com.learn.writefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program4 {

    public static void main(String[] args) throws IOException {

        String data = "This is the data fetched from API and need to be store in the file for future purpose";

        Path path = Paths.get("out1.txt");

        byte[] outStream = data.getBytes();

        Files.write(path, outStream);
    }
}
