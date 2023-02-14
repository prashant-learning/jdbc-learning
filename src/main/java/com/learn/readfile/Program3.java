package com.learn.readfile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Program3 {

    public static void main(String[] args) throws IOException {

       List<String> inputs =  Files.readAllLines(Paths.get("src/main/resources/input.csv"), StandardCharsets.UTF_8);

        System.out.println(inputs.size());

    }
}
