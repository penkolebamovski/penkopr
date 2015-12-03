package com.clouway.intro.generate;

import java.util.Arrays;

/**
 * Created by clouway on 15-10-8.
 */
public class RandomString {
    public static void main(String[] args) {
        StringGenerator opr = new StringGenerator();
        opr.generateString(12);
        /*char[] resultArr = opr.generateString(12);
        System.out.println(Arrays.toString(resultArr));*/

    }
}
