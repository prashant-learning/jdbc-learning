package com.learn.lombok;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class ProductPlatform {


    private String productId;
    private String productName;
    private int productPrice;
    private String productCategory;
}
