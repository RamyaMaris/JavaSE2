
package com.ntuc.demos.funtionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String args[]) {
        //Predicate is used to test Boolean expressions and always evaluated true or false.
        // with Single Predicate
        Predicate<String> isPhoneValid = phone
                -> phone.startsWith("+65");
        System.out.println(isPhoneValid.test("+657553445"));
        System.out.println(isPhoneValid.test("+67553445"));
        
        //With 2 Predicates with the and operator
        Predicate<String> isPhoneValid1 = phone
                -> phone.length()==10;
        System.out.println(isPhoneValid.and(isPhoneValid1).test("+657553445"));
        System.out.println(isPhoneValid.and(isPhoneValid1).test("+65755344"));
        
        //With 2 Predicates and the and operator
        Predicate<String> isPhoneValid2 = phone
                -> phone.length() == 10;
        System.out.println(isPhoneValid.or(isPhoneValid1).test("+657553445"));
        System.out.println(isPhoneValid.or(isPhoneValid1).test("+647553446"));
    }
}
