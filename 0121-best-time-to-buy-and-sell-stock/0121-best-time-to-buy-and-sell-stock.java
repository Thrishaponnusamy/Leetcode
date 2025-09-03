class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int  minpro=prices[0];
        for(int i:prices){
            if(i<minpro){
                minpro=i;
                continue;
            }
            profit=Math.max(profit,i-minpro);
        }
        return profit;
    }
}