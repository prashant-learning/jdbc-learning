package com.learn.lombok;

public class Program2 {

    public static void main(String[] args) {

        Person person = new Person("Ram", "234234", 32423.345d, "234234234");

        System.out.println(person.getName());

        //System.out.println(person.setName());  No set method


        ProductPlatform productPlatform = ProductPlatform
                .builder()
                .productCategory("Book")
                .productId("34234423")
                .productName("C++ ")
                .build();

        System.out.println(productPlatform);

        productPlatform.setProductPrice(10);

        System.out.println(productPlatform);
    }
}
