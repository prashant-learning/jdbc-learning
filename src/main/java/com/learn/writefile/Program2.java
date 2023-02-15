package com.learn.writefile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Program2 {

    public static void main(String[] args) throws IOException {

        String data = "Product table have product name %s and its price is %d";

        FileWriter fileWriter = new FileWriter("output.txt", false);

        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.printf(data, "Apple mac book", 123123);

        printWriter.close();
    }
}
