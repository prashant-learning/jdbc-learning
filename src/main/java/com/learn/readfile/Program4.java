package com.learn.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/input.csv");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
