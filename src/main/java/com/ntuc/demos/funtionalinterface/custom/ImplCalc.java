
package com.ntuc.demos.funtionalinterface.custom;

public class ImplCalc {
  public static void main(String args[]) {
        Calculator<Integer> add = (a,b)->a+b;
        Calculator<Integer> sub = (a,b)->a-b;
        Calculator<Integer> mul = (a,b)->a*b;
        
        Calculator<String> join = (x,y)-> x+y;
        
        Calculator<Integer> a = (i,j)-> i*j;
       
        Calculator<Long> longValue = (p,q)-> p-q;
        Calculator<Float> floatValue = (p,q)-> p-q;
        Calculator<Double> doubleValue = (p,q)-> p-q;
        
        Integer x = a.operation(10,20);
        String s = join.operation("asd", "xyz");
        
        
        
        System.out.println(add.operation(10,20));
        System.out.println(sub.operation(10,20));
        System.out.println(mul.operation(10,20));
       
        System.out.println(join.operation("a","b"));
        
        System.out.println(longValue.operation(10l,5l));
        System.out.println(floatValue.operation(20.5f,10.8f));
        System.out.println(doubleValue.operation(10.05,0.08));
        
        System.out.println("____________________________");
        Calculator1<Integer,Integer> comTwo = (a1,b1) -> (a1>b1);
        System.out.println("compare-->"+comTwo.operation(100, 20));

        
        
        
        
    }  
}
