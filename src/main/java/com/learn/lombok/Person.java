package com.learn.lombok;

import lombok.Value;

/**
 * Make a class immutable
 * 1. make a class final
 * 2. Make the variable private
 * 3. Write a constructor with all the instance variable
 * 4. have only getter, don't have setter
 *
 *
 */

@Value
public class Person {

    String name;
    String acctNo;
    double balance;
    String mobileNumber;

}
