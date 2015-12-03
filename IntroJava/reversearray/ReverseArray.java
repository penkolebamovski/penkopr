package com.clouway.intro.reversearray;

import java.util.Arrays;

/**
 * Created by clouway on 15-10-6.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[]array={2,4,5,17,9,12};
        Reverse opr=new Reverse();
        int [] reverseArr = opr.reverse(array);
        System.out.println(Arrays.toString(reverseArr));
    }
}
