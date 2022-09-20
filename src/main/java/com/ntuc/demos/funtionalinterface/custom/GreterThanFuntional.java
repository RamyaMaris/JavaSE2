
package com.ntuc.demos.funtionalinterface.custom;

import java.util.Scanner;
import java.util.function.Function;

public class GreterThanFuntional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = scan.nextInt();
        
        //using the imperative method
        System.out.println("Output of imperative method: "+ greaterNo(value));
        
        //using the funtional method
        System.out.println("Output of funtional method: "+res.apply(value));
        
    }
    
    static boolean greaterNo(int num){
        return (num > 50) ? true : false;
    }
    
    static Function<Integer, Boolean> res = num -> (num > 50) ? true : false;
}
