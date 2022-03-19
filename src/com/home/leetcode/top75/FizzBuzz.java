package com.home.leetcode.top75;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> list = new ArrayList<>();
        int fizz = 0;
        int buzz = 0;
        for(int i=1; i <= n; i++){
            fizz++;
            buzz++;

            if(fizz == 3 && buzz == 5){
                list.add("FizzBuzz");
                fizz = 0;
                buzz= 0;
            }
            else if(fizz == 3){
                list.add("Fizz");
                fizz = 0;
            }
            else if(buzz == 5){
                list.add("Buzz");
                buzz = 0;
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        System.out.println(list);
    }
}
