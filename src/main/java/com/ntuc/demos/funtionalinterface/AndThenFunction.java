
package com.ntuc.demos.funtionalinterface;

import java.util.function.Function;

public class AndThenFunction {
    public static void main(String[] args) {
        //using the functional combined method
        int y = combineAddAndMultiply.apply(2);
        System.out.println("Output of functional method: "+ y);
        
    }
    
    //Funcional method to increment by 1
    static Function<Integer, Integer> incrementByOne = number -> number +=1;
    
    //Functional method to multiply by 5
    static Function<Integer, Integer> multiplyByfive = number -> number *5;
    
    //Functional method to combine the above 2 functions
    static Function<Integer, Integer> combineAddAndMultiply = incrementByOne.andThen(multiplyByfive);
}
