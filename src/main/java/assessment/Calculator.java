
package assessment;


public class Calculator {
    public static void main(String[] args) {
         CacInter<Integer> addtion = (a, b)->a+b;
        System.out.println("24 + 10 = " + addtion.operation(24,10));
    }
     
}
