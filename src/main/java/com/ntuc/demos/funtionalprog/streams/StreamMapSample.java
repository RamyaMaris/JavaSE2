
package com.ntuc.demos.funtionalprog.streams;

import java.util.ArrayList;

public class StreamMapSample {
    public static void main(String[] args) {
       ArrayList<String> sal = new ArrayList<>();
        sal.add("One");
        sal.add("Apple");
        sal.add("Device");
        sal.add("Computer");
        sal.add("Keyboard");
        sal.add("Mouse");
        sal.add("Banana");
        sal.add("Singapore");
        sal.add("India"); 
        
        sal.forEach(i->System.out.println(i.formatted()));
    }
}
