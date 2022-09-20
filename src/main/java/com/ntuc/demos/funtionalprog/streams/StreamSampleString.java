
package com.ntuc.demos.funtionalprog.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSampleString {
    public static void main(String[] args) {
        
        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("One");
        arrString.add("two");
        arrString.add("three");
        arrString.add("four");
        arrString.add("five");
        arrString.add("six");
        
        List<String> list_string = arrString.stream().filter(y-> y.length() == 3).collect(Collectors.toList());
        System.out.println("String List->"+list_string);
        
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(10);
        arrInt.add(55);
        arrInt.add(56);
        arrInt.add(99);
        arrInt.add(51);
        arrInt.add(36);
        
        List<Integer> list_int = arrInt.stream().filter(x-> x%2 == 3).collect(Collectors.toList());
        System.out.println("Integer List->"+list_int);
        
//        int arr[] = {1,2,3,4,5,6,7,8,9};
//        int s=0;
//        s=Arrays.stream(arr).sum();
//        System.out.println(s/arr.length);
        
//Sequence of elements
//Source
//Agrregate Operations 
//pipelipelining
//Implicit iteration

        
    }
}
