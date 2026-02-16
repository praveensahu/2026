package dsa;
/*
Input:  [7,1,5,3,6,4]
Output: 5
Explanation:
Buy at 1, Sell at 6 → Profit = 5
*/

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if(price<minPrice){
                minPrice = price;
            }else{
                int profit = price-minPrice;
                maxProfit = Math.max(profit,maxProfit);
            }

        }
        System.out.println("Max Profit:"+maxProfit);
    }
}
