package com.learn.readfile;

import java.io.*;

public class Program2 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(new File("src/main/resources/sample.txt"));

        BufferedReader bufferedReader = new BufferedReader(fileReader);
       // bufferedReader.skip(55);

        String data = "";
        String output = "";


        while ((data = bufferedReader.readLine()) != null){
            System.out.println(data);
            output = output + " " + data;
        }

        // logic part
        // spit with (, " " .)
        System.out.println(output.trim().split(" ").length);

       // System.out.println(data.split(" "));
    }
}
