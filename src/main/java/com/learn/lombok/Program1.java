package com.learn.lombok;

import lombok.val;

public class Program1 {

    public static void main(String[] args) {

        Product product = new Product("5476456", "Java learning", 50, "Learning");
        Product product1 = new Product("234234", "C++ learning", 50, "Learning");
        Product product3 = new Product("234234", "C++ learning", 50, "Learning");


       // product1.setProductName("Java spring learning");
       // System.out.println(product1.getProductName()); // C++ learning

      //  System.out.println(product1);

        System.out.println(product1 == product3);
        System.out.println(product1.equals(product3));


        //Product product2 = new Product("id", "Java BAC");

      //  String name = "Ram";
        // Data type get inferred
        // A variable created with var can be modified (mutable)
        var name = "Ram";
        var age = 25;
        var isPresent = true;

        System.out.println(name);

        name = "Sham";

        System.out.println(name);

        // val -> final (immutable) , cannot be changed

        val accountNumber = 12312312;

        final int accountNum = 23123;
       // accountNumber = 23534534;
    }
}
