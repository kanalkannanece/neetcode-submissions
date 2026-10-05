class Solution {
    public int maxProfit(int[] prices) {
        
    int buyPrice = 0;
    int sellPrice = prices.length-1;

    int minimumPrice = 0;
    int profit = 0;

    while(buyPrice < sellPrice){
          minimumPrice =  prices[buyPrice];

        for(int i = buyPrice+1; i<=sellPrice;i++){
            profit = Math.max(profit,Math.max(prices[i]-minimumPrice,0));
        }

        buyPrice++;
        continue;

    }

    return profit;

    }
}
