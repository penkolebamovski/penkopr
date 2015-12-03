package com.clouway.intro.quick;

/**
 * Created by clouway on 15-10-6.
 */
public class Quick {


    /**
     * The method performs a quick sort of array elements
     * @param array An array declared and initialized in the main file
     * @return a sorted array
     */
    public int[] quickSort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        int middle = low + (high - low) / 2;
        int mas = array[middle];
        int m = low, n = high;

        while (m <= n) {
            while (array[m] < mas) {
                m++;
            }

            while (array[n] > mas) {
                n--;
            }

            if (m <= n) {
                int temp = array[m];
                array[m] = array[n];
                array[n] = temp;
                m++;
                n--;
            }

            if (low < n)
                quickSort(array, low, n);

            if (high > m)
                quickSort(array, m, high);
        }
    }
}
