package com.ntuc.demos.funtionalinterface;

import java.util.function.Function;

public class SimpleFuntion {
    public static void main(String[] args) {
        //using the imperative method
        int x = incrementByOne(10);
        System.out.println("Output of imperative method: "+x);
        
        //using functional method
        int y = incrementByOne.apply(10);
        System.out.println("Output of imperative method: "+y);
        System.out.println(len.apply("String length "));
    }
    
    //imperative program
    static int incrementByOne(int num)
    {
        return num+=1;
    }
    
    //Funtional method 
    //using funtional which accepts one argument and a return type
    
    static Function<Integer, Integer> incrementByOne = number -> number +=1;
    static Function<String, Integer> len = x -> x.length();
}
