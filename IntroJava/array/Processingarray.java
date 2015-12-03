package com.clouway.intro.array;

/**
 * Created by clouway on 15-10-6.
 */
public class Processingarray {
    public static void main(String[] args) {
       int array[] = {5, 2, 8, 13};
        Masiv opr=new Masiv();
        System.out.println(opr.getMinElement(array));
        System.out.println(opr.getSum(array));
        opr.printArray(array);
    }
}
