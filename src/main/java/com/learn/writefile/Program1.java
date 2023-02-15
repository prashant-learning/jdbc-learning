package com.learn.writefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {

    public static void main(String[] args) throws IOException {

        String data = " Mouli" ;

        FileWriter fileWriter = new FileWriter("output.txt", false);

        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.write(data);
       // writer.append(data);

        writer.close();

    }
}
