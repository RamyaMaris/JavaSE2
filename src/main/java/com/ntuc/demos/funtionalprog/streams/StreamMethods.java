
package com.ntuc.demos.funtionalprog.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
         List<String> fruits = Arrays.asList("Apple", "", "Banana", "", "Jack", "Grapes");
        List<Integer> nums = Arrays.asList(10, 100, 200, 2000, 3000, 6766);
        // counting empty strings
        long count = fruits.stream()
                .filter(i -> i.isEmpty())
                .count();
        System.out.println(count);

        // count fruits with "a"
        long count1 = fruits.stream()
                .filter(i -> i.startsWith("a"))
                .count();
        System.out.println(count1);

        // remove all empty strings
        List<String> noBlanks = fruits.stream()
                .filter(fruit -> !fruit.isEmpty())
                .collect(Collectors.toList());
        System.out.println(noBlanks.toString());

        // display Strings in uppercase
        String fruit = fruits.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(": "));
        System.out.println(fruit);

        // sum of all numbers
        // reduce method takes the list of items and reduces to one
        //Reducing is the repeated process of combining all elements.
        // identity is the initial value eg: int i=0
        long sum = nums.stream().reduce(0, (n1, n2) -> (n1 + n2));
        System.out.println(sum);

        // Max of all numbers
        // uses the Integer.compare(int,int)
        int max = nums
                .stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);

        // Min of all numbers
        // uses the Integer.compare(int,int)
        int min = nums
                .stream()
                .min(Integer::compare)
                .get();
        System.out.println(min);

        // display min, max sum etc..
        // DoubleSummaryStatistics, IntSummaryStatistics, andLongSummaryStatistics 
        IntSummaryStatistics stats = nums
                .stream()
                .mapToInt(x -> x)
                .summaryStatistics();

        System.out.println(stats);
    }
}
