package com.sc.vag.utils;

/**
 * Created by 1533435 on 11/21/2018.
 */
public class GeneralUtilities {
    public static String convertToString(int number)
    {
        String[] names = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return names[number];
    }
}
