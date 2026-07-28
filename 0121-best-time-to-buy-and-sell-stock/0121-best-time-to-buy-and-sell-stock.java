class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit= 0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(minPrice > prices[i])
                minPrice= prices[i];
            else{
                int profit = prices[i]-minPrice ;
                maxProfit= Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}