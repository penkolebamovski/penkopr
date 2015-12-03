package com.clouway.intro.array;

import java.util.Scanner;

/**
 * Created by clouway on 15-10-6.
 */
public class Masiv {
    /**
     * Method returns the smallest element of the array after search
     *
     * @param array is declared initialized from main document
     * @return Method return minimal element of the of the array the name is getMinElement
     */
    public int getMinElement(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Method returns the sum of elements
     * @param array is declared initialized from main document
     * @return Method return the sum of elements who is "s"
     */
    public int getSum(int[] array) {
        int n = 0;
        int s = 0;

        for (int i = 0; i < n; i++) {
            s = s + array[i];
        }
        return s;
    }

    /**
     * Method displays the elements of the array where length is length of the array
      * @param array is declared initialized from main document
     */
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element masiv" + i + "-" + array[i]);

        }
    }
}
