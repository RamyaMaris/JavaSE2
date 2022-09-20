
package com.ntuc.demos.funtionalinterface;

import java.util.function.BiPredicate;


public class BiPredicateExample {
    public static void main(String args[]) {
        System.out.println(checkPasswordLen.test("password", 8));//length = 8 so o/p true
//        System.out.println(checkPasswordLen.test("password", 9));//length = 8 so o/p false
        }
    
    // Check password length using the BiPredicate
    static BiPredicate <String, Integer> checkPasswordLen = (x, y) -> {
            return x.length() == y;
        };

    
}

