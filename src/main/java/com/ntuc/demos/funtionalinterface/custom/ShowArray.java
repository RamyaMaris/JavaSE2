
package com.ntuc.demos.funtionalinterface.custom;

public class ShowArray {
    public  static void showar(String[] s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    
    public  static void showar(Integer[] s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    
    public static <T> void printar(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
        }
    
    public static void main(String args[]) {
        String[] sar ={"One","Two","Three","Anything"};
        Integer[] iar = {1,2,3,4,5};
        Double[] dar ={1.5d,2.3d,4.2d};
//        showar(sar);
//        showar(iar);
           
            printar(iar);
            printar(sar);
            printar(dar);
            
    }
}
