
package com.ntuc.demos.funtionalinterface;

import java.util.Random;
import java.util.function.Supplier;


public class SupplierExample {
    public static void main(String[] args) {
        //Exact oppsite to consumer
        //Returns a value without an input parameter
        Supplier<Integer> rds = () -> new Random().nextInt(10);
        System.out.println(rds.get());
    }
}
