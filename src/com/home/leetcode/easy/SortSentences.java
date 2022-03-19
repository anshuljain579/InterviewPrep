package com.home.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortSentences {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String result = sortSentences(s);
        System.out.println(result);
    }

    public static String sortSentences(String s){
        String[] strArr = s.split(" ");
        Map<Integer, String> map = new HashMap<>();
        for(String a : strArr){
            int num = Integer.parseInt(a.replaceAll("[^0-9]", ""));
            map.put(num, a.substring(0, a.length() -1));
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            sb.append(entry.getValue() + " ");
        }
        return sb.toString().trim();

    }
}
