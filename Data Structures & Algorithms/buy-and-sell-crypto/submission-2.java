class Solution {
    public int maxProfit(int[] prices) {
        
    int buyPrice = 0;

    int profit = 0;

    while(buyPrice < prices.length-1){
        for(int i = buyPrice+1; i<=prices.length-1;i++){
            profit = Math.max(profit,Math.max(prices[i]-prices[buyPrice],0));
        }

        buyPrice++;
        continue;

    }

    return profit;

    }
}
