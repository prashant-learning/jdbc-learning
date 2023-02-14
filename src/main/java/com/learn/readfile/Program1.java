package com.learn.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 *    FileReader, BufferReader and Scanner
 *
 *
 *
 */
public class Program1 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(new File("src/main/resources/input.csv"));

        int data;

        while((data = fileReader.read()) != -1){
            System.out.print((char) data);
        }

    }
}
