package com.home.leetcode.top75;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};
        getReverseString(charArr);
    }

    public static void getReverseString(char[] ch){
        int l = 0;
        int r = ch.length - 1;
        char c;
        while( l < r){
            c = ch[l];
            ch[l] = ch[r];
            ch[r] = c;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(ch));
    }
}
