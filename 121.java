class Solution {
    public int maxProfit(int[] prices) {
        int minPrize =  prices[0];
        int max = 0 ;
        for(int i = 1 ; i < prices.length ; i++)
        {
            if(prices[i]< minPrize)
            {
                minPrize = prices[i];
            }
            else
            {
                if(prices[i]-minPrize > max)
                {
                    max = prices[i]-minPrize;
                }
            }
        }
        return max;
        
    }
}