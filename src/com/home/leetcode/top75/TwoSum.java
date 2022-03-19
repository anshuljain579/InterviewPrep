package com.home.leetcode.top75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] result = getTwoSumIndex(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getTwoSumIndex(int[] nums, int target){
        int[] result = new int[2];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < nums.length; i++){
            int num = target - nums[i];
            if(list.contains(num)){
                result[0] = i;
                result[1] = list.indexOf(num);
            }
            list.add(nums[i]);
        }
        return result;
    }
}
