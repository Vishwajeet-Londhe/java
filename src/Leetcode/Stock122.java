package Leetcode;

public class Stock122 {
    public static void main (String[] args){
        int[] prices = {7,1,5,3,6,4};
        int[] prices1 = {7,6,5,4,3,2,1};
        int[] prices2 = {1,2,3,4,5};

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]<prices[i+1]){
                max_profit += prices[i+1] - prices[i];
            }
        }
        return max_profit;
    }

}
