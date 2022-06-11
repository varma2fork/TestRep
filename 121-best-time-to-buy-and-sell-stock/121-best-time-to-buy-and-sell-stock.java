class Solution {
    public int maxProfit(int[] prices) {
        
        int l = 0;
        int r = 1;
        int maxp = 0;
        
        while(r< prices.length) {
            if(prices[l] < prices[r]) {
                maxp = Math.max(maxp, prices[r] - prices[l]);
            }
            else {
                l = r;
            }
            r = r+ 1;
        }
        
        return maxp;
        
    }
}