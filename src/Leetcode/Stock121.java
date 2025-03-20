package Leetcode;

public class Stock121 {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

        int[] prices1 = {7,6,4,3,1};
        System.out.println(maxProfit(prices1));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max_profit = 0;
        int buy_price = prices[0];

        for(int i =0; i<n; i++){
            int curr_profit = prices[i] - buy_price;

            if(curr_profit > max_profit){
                max_profit = curr_profit;
            }

            if(prices[i]<buy_price){
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
}
