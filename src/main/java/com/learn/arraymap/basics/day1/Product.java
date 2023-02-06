package com.learn.arraymap.basics.day1;

/**
 *    class
 *      1. Variable
 *      2. constructor
 *      3. Getter Setter
 *      4. toString   -> to print the object in log with more information
 *
 *
 */


public class Product implements Comparable {

    private String product_id;
    private String product_name;
    private int product_price;
    private String product_category;

    public Product(String product_id, String product_name, int product_price, String product_category) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_category = product_category;
    }


    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }


    @Override
    public int compareTo(Object o) {
        Product product = (Product) o;
        if( this.product_price < product.product_price){
            return  -1;
        } else if (this.product_price > product.product_price) {
            return 1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id='" + product_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_category='" + product_category + '\'' +
                '}';
    }
}
