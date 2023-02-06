package com.learn.arraymap.basics.day2;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Program3 {

    public static void main(String[] args) {

        // [2,7,11,15]  target = 18

        int[] inputArray = {2,7,11,15,23,65,3,8,98,2,100,45,32,77,89,4,99,91,56,25,345,32,2,453245,345,3,456,346,56,4576,345,35,345,456,54,235,3445,345,77,6,4,77,324,234,8899,989,1231,34,5657,6576,23432,345345,364,43};

        int target = 199;

        long startTime = LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli();

        for (int i = 0; i < inputArray.length; i++){
            for (int j = i +1; j < inputArray.length; j++){
                if(inputArray[i] + inputArray[j] == target){
                    System.out.println("first index is " + i + " second index is "+ j);
                }
            }
        }
        long endTime = LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli();

        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println(endTime - startTime);




    }
}
