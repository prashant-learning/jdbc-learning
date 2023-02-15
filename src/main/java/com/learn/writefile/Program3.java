package com.learn.writefile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *   FileOutputStream
 *
 */
public class Program3 {

    public static void main(String[] args) throws IOException {

        String data = "This is the data fetched from API and need to be store in the file for future purpose";

        FileOutputStream fileOutputStream = new FileOutputStream("out.txt", false);

        byte[] outputStream = data.getBytes();

        fileOutputStream.write(outputStream);

        fileOutputStream.close();

    }
}
