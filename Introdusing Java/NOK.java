package com.clouway.intro.mathdemo;

import java.util.Scanner;

/**
 * Created by clouway on 15-10-5.
 */
public class NOK {

    /**
     * Method solve least common multiple of two numbers entered by the user the name is nok
     * @param a the first number
     * @param b the second number
     * @return least common multiple
     */
    public int nok(int a, int b) {
        return a * (b / nod(a, b));
    }

    /**
     * Method solve the greatest common divisor of two numbers entered by the user the name is nod
     * @param a the first number
     * @param b the second number
     * @return the lowest common denominator
     */
    public int nod(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;

                return b;
            }
        }
        return a;
    }

}
