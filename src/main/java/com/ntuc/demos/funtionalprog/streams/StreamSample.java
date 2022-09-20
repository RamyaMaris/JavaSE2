
package com.ntuc.demos.funtionalprog.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
     public static void main(String args[]) {
         /*
Sequence of elements
Source
Agrregate Operations 
pipelipelining
Implicit iteration 
 */
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(56);
        al.add(66);
        al.add(77);
        al.add(88);
        al.add(99);

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

//        sal.forEach(i->System.out.println(i.length()));
        sal.stream()
                .map(i -> i.length())
                .peek(System.out::println)
                .filter(k -> k > 3)
                .sorted()
                .forEach(System.out::println);
        System.out.println("__________________________________________________");
        // Declarative 
        List<Integer> ls = al.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(ls);
        System.out.println("__________________________________________________");
        // Arrays using streams
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s = 0;
        s = Arrays.stream(arr).sum();
        System.out.println(s / arr.length);
        System.out.println("__________________________________________________");
        // map and for each method 
//        al.stream().map(i->i*2).filter(k->k<=100).forEach(m->System.out.println(m));
        al.stream().map(i -> i * 2).filter(k -> k <= 100).forEach(System.out::println);
        long s1 = al.stream().map(i -> i * 2).filter(k -> k <= 100).count();
        al.stream().map(i -> i * 2).filter(k -> k <= 100).count();
        System.out.println(s1);
        System.out.println("__________________________________________________");
        // peek method
    }

}
