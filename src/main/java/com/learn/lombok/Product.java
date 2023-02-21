package com.learn.lombok;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Product {

    @NonNull
    private String productId;
    @NonNull
    private String productName;
    private int productPrice;
    private String productCategory;

    // constructor

    // Getter and Setter

    // to string method



}
