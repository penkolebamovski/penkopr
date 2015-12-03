package com.clouway.intro.quick;

import com.clouway.intro.quick.Quick;

import java.util.Arrays;

/**
 * Created by clouway on 15-10-6.
 */
public class Quicksort {
    public static void main(String[] args) {
       int[]array={2,4,5,17,9,12};

        Quick opr=new Quick();

        int [] sortarr = opr.quickSort(array);

        System.out.println(Arrays.toString(sortarr));
    }
}
