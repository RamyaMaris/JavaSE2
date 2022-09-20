/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntuc.demos.funtionalinterface;

import java.util.function.BiFunction;

/**
 *
 * @author ACER
 */
public class BiFunctionSample {
     public static void main(String args[]) {
        //using the Imperative method
        int x = calculate(1,5);
        System.out.println("output of imperative method: " + x);
        // using the BiFunctional method
        int y = calculate.apply(1, 5);
        System.out.println("output of Functional method: " + y);
        System.out.println(calculate.apply(1, 5));
    }

    // imperative program
    static int calculate(int x, int y) {
        return (x + 1) * y;
    }
    // BiFunctional method
    // accepts two arguments and and return
    static BiFunction<Integer, Integer, Integer> calculate = (x,y)-> (x+1)*y;

}

