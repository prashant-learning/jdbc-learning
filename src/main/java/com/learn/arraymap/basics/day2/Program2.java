package com.learn.arraymap.basics.day2;


import java.util.*;

/**
 *
 *
 *    create a list of product
 *
 *
 *
 *
 */
public class Program2 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>(); // empty array list

        Product product1 = new Product("1234", "java head first",567,"book");
        Product product2 = new Product("1235", "python head first",966,"book");
        Product product3 = new Product("1236", "c++ head first",869,"book");


        // inserting the objects inside the list
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        System.out.println(productList);

        // find the highest product price

        int highestPrice = -1;
        Product highestPricedProduct = null;
        int totalSum = 0;

        for (Product product: productList) {

            totalSum = totalSum + product.getProduct_price();

            if(product.getProduct_price() > highestPrice){
                highestPrice = product.getProduct_price();
                highestPricedProduct = product;
            }
        }
        System.out.println(highestPricedProduct);
        System.out.println("total product price "+ totalSum);

        // Create a map from the object array with key as product_id of the object

        /**
         *
         *    Map [   "1234" -> Product{product_id='1234', product_name='java head first', product_price=567, product_category='book'},
         *             "1235" -> Product{product_id='1235', product_name='python head first', product_price=966, product_category='book'},
         *             "1236" -> Product{product_id='1236', product_name='c++ head first', product_price=869, product_category='book'}
         *         ]
         *    List of objects  = productList
         */

        // empty Map<String, Product>

      //  Map<String, Product> productMap = new HashMap<String, Product>(Collections.EMPTY_MAP);


      Map<String, Product>  productMap =  new HashMap<>(Collections.EMPTY_MAP);

        for (Product product: productList) {

            productMap.put(product.getProduct_id(), product);
        }

        System.out.println(productMap);

    }

}
