
package com.ntuc.demos.funtionalinterface;

import java.util.function.Consumer;

public class ConsumerFunction {
    public static void main(String[] args) {
        //call to imperative approach
        greet("Simon ");
        //call to the functional approach
        greet.accept("James");
    }
    
    //imperative program with void
    static void greet(String user){
        System.out.println("Hello "+user);
    }
    
    //functional program using consumer method
    //consumer is as good as void in imperative program
    //consumer is a single argument void method equivalent
    
    static Consumer<String> greet = user -> System.out.println("Hello " + user);
}
