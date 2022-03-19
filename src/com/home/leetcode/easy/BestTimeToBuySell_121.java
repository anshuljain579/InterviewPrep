package com.home.leetcode.easy;

public class BestTimeToBuySell_121 {
    public static void main(String[] args) {
        int[] prices = {7,1,3,5,6,4};
        int maxProfit = getMaxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int getMaxProfit(int[] prices){
        int left = 0;
        int right = 1;

        int maxProfit = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                left = right;
            }
            right += 1;
        }
        return maxProfit;
    }
}
