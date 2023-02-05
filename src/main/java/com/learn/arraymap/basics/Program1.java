package com.learn.arraymap.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 *    find the product with highest price
 *
 *
 *    convert this to map
 *       Key -> product_id  (id)
 *       value -> product (id, name, price, category)
 */
public class Program1 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Product product1 = new Product(
                "0d591d4c-ef8d-4f56-8898-6033e686e0bd",
                "Bat",
                500,
                "Playing tool"
        );

        Product product2 = new Product(
                "0d591d4c-ef8d-4f56-8898-6033e686e1cd",
                "Ball",
                50,
                "Playing tool"
        );

        Product product3 = new Product(
                "0d771d4c-ef8d-4f22-8898-6033e686e1cd",
                "Head first with java",
                1599,
                "Book"
        );

        Product product4 = new Product(
                "0d771d4c-ef8d-4f22-8898-6033e686e1cd",
                "Head first with c++",
                1299,
                "Book"
        );

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        System.out.println(productList);

        Collections.sort(productList);

        System.out.println(productList);

        // filter the items whose price is more than 700 rs
        // stream  -> not teach
        // normal programing concepts
        List<Product> newProductList = new ArrayList<>();

        for (Product product : productList) {

            if(product.getProduct_price() < 700){
                newProductList.add(product);
            }
        }

        System.out.println(newProductList);

        // Find the sum of all the price -> Bucket item price
        int bucketItemPrices = 0;

        for (Product product : productList) {

            bucketItemPrices = bucketItemPrices + product.getProduct_price();
        }

        System.out.println(bucketItemPrices);
    }
}
