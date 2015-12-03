package com.clouway.intro.generate;

import java.util.Random;

/**
 * Created by clouway on 15-10-7.
 */
public class StringGenerator {
    private final String charlist = "abcdefghigklmnopqrstv";

    /**
     * Method generates a random string of adjustable length
     * @param length determines the length of the string
     */
    public void generateString(int length) {

        Random r = new Random();
        //char[]result=new char[length];
        StringBuilder s = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            s.append(charlist.charAt(r.nextInt(charlist.length())));
        }
        //return s.toString();
        /** char c= result[r.nextInt(result.length)];
         s.append(c);
         }**/
        String output = s.toString();
        System.out.println(output);

    }
    /** byte[]result=new byte[length];
     for(int i=0;i<6;i++)
     {
     result[i]=r.nextBytes(length);
     }
     return result;**/
    /**  String[] array = new String[length];
     for (int i = 0; i < length; i++){
     //            array[i]=rstring.charAt(r.nextInt(rstring.length()));**/
    /**  return "";**/
}

