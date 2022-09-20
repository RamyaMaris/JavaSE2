
package com.ntuc.demos.funtionalinterface.custom;

public class ImplFindMax {
    public static void main(String args[]) {
        FindMax fm = (n1, n2)
                -> {
            if (n1 > n2) {
                return n1;
            } else {
                return n2;
            }
        };
        
        int  res = fm.findMax(100, 20);
        System.out.println(res);
    }
}
